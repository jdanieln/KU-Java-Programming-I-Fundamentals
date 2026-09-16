# KU - Java Programming I: Fundamentals

Repositorio oficial del curso de programación en Java con integración a GitHub y Antigravity.

---

## 📌 ¿Cómo registrar tu asistencia con Antigravity?

¡Registrar tu asistencia y mantener tu proyecto actualizado es muy fácil! No necesitas memorizar comandos de Git complejos.

### Paso 1: Abre el chat de Antigravity en el IDE
En la ventana de Antigravity, escribe un mensaje sencillo como:

> **"Antigravity, registra mi asistencia"**
> 
> o simplemente:
> 
> **"marcar asistencia"**

### Paso 2: Antigravity se encarga del resto
Automáticamente, el asistente:
1. **Descargará los últimos cambios** del profesor o del repositorio (`git pull`).
2. **Detectará tu usuario de GitHub/Git** y los datos de tu entorno:
   - Versión de Java y JDK
   - Versión de Git
   - Sistema Operativo
   - Fecha y hora exacta
3. **Creará tu registro individual** en `asistencias/YYYY-MM-DD/<tu-usuario>.json` (evitando conflictos con tus compañeros).
4. **Subirá tu asistencia a GitHub** (`git push`).

---

## 🛠️ Ejecución manual (Opcional)

Si prefieres ejecutar el script desde tu terminal:

```bash
./scripts/registrar_asistencia.sh
```

---

## 💻 Requisitos del Entorno
- **Java Development Kit (JDK)**: versión 17 o superior.
- **Git** configurado con tu usuario:
  ```bash
  git config --global user.name "Tu Nombre"
  git config --global user.email "tu_email@ejemplo.com"
  ```
- **GitHub CLI (`gh`)** (Opcional, pero recomendado para autenticación automática).
