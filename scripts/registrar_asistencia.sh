#!/usr/bin/env bash
# ==============================================================================
# Script de Registro Automatizado de Asistencia y Sincronización
# Curso: KU - Java Programming I: Fundamentals
# ==============================================================================

set -e

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$REPO_ROOT"

echo "=================================================="
echo "🚀 Sincronizando repositorio y registrando asistencia"
echo "=================================================="

# 1. Determinar la rama actual
BRANCH=$(git branch --show-current 2>/dev/null || echo "master")
if [ -z "$BRANCH" ]; then
    BRANCH="master"
fi

echo "📌 Rama actual detectada: $BRANCH"

# 2. Bajar los últimos cambios del repositorio
echo "⬇️  Descargando últimos cambios remotos (git pull --rebase)..."
git pull --rebase origin "$BRANCH" || {
    echo "⚠️  Advertencia: No se pudo sincronizar con origin/$BRANCH directamente. Verifica tu conexión a internet o credenciales."
}

# 3. Detectar nombre de usuario de GitHub / Git
GITHUB_USER=""
if command -v gh >/dev/null 2>&1; then
    GITHUB_USER=$(gh api user -q .login 2>/dev/null || true)
fi

GIT_NAME=$(git config user.name || true)
GIT_EMAIL=$(git config user.email || true)

if [ -z "$GITHUB_USER" ]; then
    if [ -n "$GIT_NAME" ]; then
        GITHUB_USER="$GIT_NAME"
    elif [ -n "$GIT_EMAIL" ]; then
        GITHUB_USER="$GIT_EMAIL"
    else
        GITHUB_USER="$(whoami 2>/dev/null || echo "estudiante")"
    fi
fi

# Limpiar nombre para que sea seguro en nombres de archivos
SAFE_USER=$(echo "$GITHUB_USER" | tr ' /\\:' '____' | tr -cd '[:alnum:]_.-')
if [ -z "$SAFE_USER" ]; then
    SAFE_USER="estudiante"
fi

# 4. Recopilar datos del entorno
FECHA=$(date +"%Y-%m-%d")
TIMESTAMP=$(date +"%Y-%m-%d %H:%M:%S %z" 2>/dev/null || date +"%Y-%m-%d %H:%M:%S")

# Sistema Operativo
OS_INFO="$(uname -srm 2>/dev/null || echo "Desconocido")"
if command -v sw_vers >/dev/null 2>&1; then
    PRODUCT_NAME=$(sw_vers -productName 2>/dev/null || true)
    PRODUCT_VERSION=$(sw_vers -productVersion 2>/dev/null || true)
    BUILD_VERSION=$(sw_vers -buildVersion 2>/dev/null || true)
    OS_INFO="$PRODUCT_NAME $PRODUCT_VERSION ($BUILD_VERSION) - $(uname -m 2>/dev/null || true)"
fi

# Versión de Java
JAVA_VERSION="No instalado o no disponible en PATH"
if command -v java >/dev/null 2>&1; then
    JAVA_RAW=$(java -version 2>&1 | head -n 2 | tr '\n' ' ' | sed 's/"/\\"/g')
    JAVA_VERSION="$JAVA_RAW"
fi

# Versión de Git
GIT_VERSION="No instalado"
if command -v git >/dev/null 2>&1; then
    GIT_VERSION=$(git --version 2>/dev/null || echo "Desconocido")
fi

HOST_NAME=$(hostname 2>/dev/null || echo "local")

# 5. Crear directorio y archivo de asistencia
ASISTENCIAS_DIR="asistencias/$FECHA"
mkdir -p "$ASISTENCIAS_DIR"

OUTPUT_FILE="$ASISTENCIAS_DIR/${SAFE_USER}.json"

cat <<EOF > "$OUTPUT_FILE"
{
  "github_user": "$GITHUB_USER",
  "git_name": "$GIT_NAME",
  "git_email": "$GIT_EMAIL",
  "fecha": "$FECHA",
  "timestamp": "$TIMESTAMP",
  "os": "$OS_INFO",
  "java_version": "$JAVA_VERSION",
  "git_version": "$GIT_VERSION",
  "hostname": "$HOST_NAME",
  "branch": "$BRANCH"
}
EOF

echo "✅ Asistencia generada exitosamente en: $OUTPUT_FILE"
echo "--------------------------------------------------"
cat "$OUTPUT_FILE"
echo ""
echo "--------------------------------------------------"

# 6. Preparar commit
git add "$OUTPUT_FILE"

if git diff --staged --quiet; then
    echo "ℹ️  La asistencia ya estaba registrada con los mismos datos para el día de hoy."
else
    git commit -m "Asistencia: $GITHUB_USER - $FECHA"
fi

# 7. Sincronizar y subir cambios al remoto
echo "⬆️  Sincronizando nuevamente y subiendo cambios (git push)..."
git pull --rebase origin "$BRANCH" || true
git push origin "$BRANCH"

echo ""
echo "🎉 ¡Excelente! Asistencia registrada y subida correctamente a GitHub."
echo "=================================================="
