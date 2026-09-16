# Guía y Reglas del Proyecto para Antigravity

Este repositorio corresponde al curso **KU - Java Programming I: Fundamentals**.
El entorno está preparado para estudiantes que están aprendiendo a utilizar Git, GitHub y Antigravity.

## Asistencia de Estudiantes

Cuando el estudiante envíe un prompt simple solicitando registrar o marcar su asistencia (por ejemplo: *"asistencia"*, *"marcar asistencia"*, *"registrar mi asistencia"*, *"bajar cambios y subir asistencia"*):

1. Activa y sigue la skill `registrar-asistencia`.
2. Proactivamente ejecuta el script automatizado `./scripts/registrar_asistencia.sh`.
3. El script automáticamente:
   - Descarga los cambios más recientes del repositorio remoto (`git pull --rebase`).
   - Registra el usuario de GitHub/Git y las especificaciones de su entorno (Java, Git, OS, fecha/hora) en `asistencias/YYYY-MM-DD/<usuario>.json`.
   - Realiza el commit y push al repositorio remoto en GitHub.
4. Muestra al estudiante una confirmación amigable con el resumen de los datos registrados.
