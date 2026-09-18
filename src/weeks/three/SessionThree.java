package weeks.three;

/**
 * =========================================================================
 * SEMANA 3: ESTRUCTURAS DE CONTROL EN JAVA
 * =========================================================================
 * Temas cubiertos:
 * 1. Estructuras Condicionales:
 *    - if, else if, else
 *    - Operador ternario (? :)
 *    - switch tradicional y switch de expresión (Java moderno)
 * 2. Estructuras Repetitivas (Ciclos / Bucles):
 *    - for clásico
 *    - for-each (iteración de colecciones y arreglos)
 *    - while
 *    - do-while
 * 3. Sentencias de salto:
 *    - break
 *    - continue
 * =========================================================================
 */
public class SessionThree {

    // --- 1. ESTRUCTURAS CONDICIONALES ---

    /**
     * Demuestra el uso de if, else if, else y operador ternario.
     */
    public void demonstrateIfElse(int score) {
        System.out.println("=== 1. CONDICIONALES: if / else if / else ===");
        System.out.println("Evaluando puntaje: " + score);

        // if-else if-else en cascada
        String letterGrade;
        if (score >= 90) {
            letterGrade = "A (Excelente)";
        } else if (score >= 80) {
            letterGrade = "B (Muy Bueno)";
        } else if (score >= 70) {
            letterGrade = "C (Aprobado)";
        } else if (score >= 60) {
            letterGrade = "D (Requiere Mejora)";
        } else {
            letterGrade = "F (Reprobado)";
        }
        System.out.println("Calificación obtenida: " + letterGrade);

        // Operador ternario: (condicion) ? valor_si_verdadero : valor_si_falso
        boolean isApproved = (score >= 70);
        String status = isApproved ? "Aprobado exitosamente" : "Reprobado, debe recursar";
        System.out.println("Estado final (operador ternario): " + status);
        System.out.println();
    }

    /**
     * Demuestra el uso de switch tradicional y switch moderno (expresiones con flecha).
     */
    public void demonstrateSwitch(int dayOfWeek) {
        System.out.println("=== 2. CONDICIONALES: switch clásico vs switch moderno ===");

        // --- Switch tradicional con 'break' ---
        System.out.print("[Switch tradicional] Día " + dayOfWeek + ": ");
        switch (dayOfWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Día inválido");
                break;
        }

        // --- Switch moderno como expresión (Java 14+) con sintaxis flecha '->' ---
        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Día hábil / laboral";
            case 6, 7 -> "Fin de semana / descanso";
            default -> "Día desconocido";
        };
        System.out.println("[Switch moderno (expresión)]: " + dayType);
        System.out.println();
    }

    // --- 2. ESTRUCTURAS REPETITIVAS (CICLOS / BUCLES) ---

    /**
     * Demuestra el ciclo for tradicional y for-each mejorado.
     */
    public void demonstrateForLoops() {
        System.out.println("=== 3. CICLOS: for tradicional y for-each ===");

        // For tradicional: inicialización; condición; incremento
        System.out.print("Conteo con for tradicional (1 al 5): ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + (i < 5 ? ", " : ""));
        }
        System.out.println();

        // For-each: ideal para recorrer arreglos o colecciones sin manejar índices manuales
        String[] languages = {"Java", "Python", "C#", "JavaScript", "Go"};
        System.out.println("Iteración de arreglo con for-each:");
        for (String lang : languages) {
            System.out.println("  - Lenguaje: " + lang);
        }
        System.out.println();
    }

    /**
     * Demuestra el ciclo while (pre-evaluación) y do-while (post-evaluación).
     */
    public void demonstrateWhileLoops() {
        System.out.println("=== 4. CICLOS: while vs do-while ===");

        // While: evalúa la condición ANTES de ejecutar el bloque
        int countdown = 3;
        System.out.print("Cuenta regresiva con while: ");
        while (countdown > 0) {
            System.out.print(countdown + "... ");
            countdown--;
        }
        System.out.println("¡Despegue!");

        // Do-While: ejecuta el bloque al menos UNA VEZ antes de evaluar la condición
        int number = 10;
        System.out.println("Ejecución garantizada con do-while:");
        do {
            System.out.println("  Se ejecuta al menos esta vez aunque la condición sea falsa (number = " + number + ")");
            number++;
        } while (number < 5); // La condición es falsa desde el inicio (11 < 5 es false)

        System.out.println();
    }

    // --- 3. SENTENCIAS DE SALTO: break y continue ---

    /**
     * Demuestra cómo break interrumpe un bucle y continue pasa a la siguiente iteración.
     */
    public void demonstrateBreakAndContinue() {
        System.out.println("=== 5. SENTENCIAS DE SALTO: break y continue ===");

        // Uso de 'continue': omitir iteración (ej: imprimir sólo números pares del 1 al 10)
        System.out.print("Uso de continue (filtrando impares): ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Salta al siguiente ciclo sin ejecutar lo que sigue
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Uso de 'break': detener la búsqueda cuando se encuentra el objetivo
        int[] numbers = {15, 30, 42, 68, 90, 105};
        int target = 42;
        System.out.print("Uso de break (buscando el número " + target + "): ");

        for (int num : numbers) {
            System.out.print("[" + num + "] ");
            if (num == target) {
                System.out.println("-> ¡Número " + target + " encontrado! Interrumpiendo ciclo.");
                break; // Sale inmediatamente del bucle
            }
        }
        System.out.println();
    }

    /**
     * Ejecuta todas las demostraciones de estructuras de control.
     */
    public void run() {
        demonstrateIfElse(85);
        demonstrateSwitch(3);
        demonstrateForLoops();
        demonstrateWhileLoops();
        demonstrateBreakAndContinue();
    }
}
