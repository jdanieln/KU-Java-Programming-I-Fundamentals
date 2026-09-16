---
name: registrar-asistencia
description: >-
  Use this skill when the student or user asks to record attendance, mark attendance,
  sync repository changes and submit attendance, or simply says "asistencia", "registrar asistencia",
  "marcar asistencia", or "bajar cambios y subir asistencia".
---

# Registrar Asistencia y Sincronizar Repositorio

Esta skill automatiza el proceso para que los estudiantes del curso descarguen las últimas actualizaciones del repositorio y registren su asistencia junto con los detalles de su entorno y usuario de GitHub.

## Procedimiento

1. **Verificar el estado del repositorio:**
   Asegurarse de estar en la raíz del proyecto y comprobar que no haya conflictos pendientes en git:
   ```bash
   git status
   ```

2. **Ejecutar el script de registro de asistencia:**
   Ejecutar el script automatizado que se encarga de:
   - Hacer `git pull --rebase origin <rama_actual>`.
   - Detectar el usuario de GitHub/Git (`gh` CLI o `git config user.name`).
   - Capturar información del sistema (OS, versión de Java, versión de Git, fecha y hora).
   - Generar el archivo `asistencias/YYYY-MM-DD/<usuario>.json`.
   - Realizar `git add`, `git commit` y `git push`.

   Comando de ejecución:
   ```bash
   ./scripts/registrar_asistencia.sh
   ```

3. **Fallback en caso de entornos sin permisos de ejecución o Windows CMD:**
   Si `./scripts/registrar_asistencia.sh` no se puede ejecutar directamente, ejecutarlo mediante bash o realizar las operaciones manualmente:
   ```bash
   bash scripts/registrar_asistencia.sh
   ```

4. **Confirmación al Estudiante:**
   Una vez completado el script con éxito:
   - Informar al estudiante que su asistencia ha sido registrada y subida al repositorio remoto.
   - Mostrarle un breve resumen con su usuario detectado, la fecha, y su versión de Java.
