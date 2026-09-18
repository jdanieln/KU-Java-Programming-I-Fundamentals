package weeks.one;

/**
 * =========================================================================
 * SEMANA 1: FUNDAMENTOS DE JAVA
 * =========================================================================
 * Temas cubiertos:
 * 1. Tipos de comentarios en Java.
 * 2. Variables y Tipos de Datos (Primitivos y Referencia).
 * 3. Constantes e Inferencia de Tipos.
 * 4. Introducción a la Programación Orientada a Objetos (POO).
 * =========================================================================
 */
public class SessionOne {

    public void demonstrateComments() {
        System.out.println("=== 1. TIPOS DE COMENTARIOS EN JAVA ===");

        // Comentario de una sola línea: útil para notas breves o explicaciones puntuales.

        /*
         * Comentario de bloque o multilínea:
         * Útil cuando se necesita explicar un bloque de código
         * más extenso o detallado.
         */

        /**
         * Comentario Javadoc:
         * Se utiliza para documentar clases, interfaces, métodos y atributos.
         * Herramientas automáticas generan páginas web HTML de documentación con esto.
         */

        System.out.println("Se revisaron los 3 tipos: línea simple (//), multilínea (/* ... */) y Javadoc (/** ... */).");
        System.out.println();
    }

    public void demonstrateVariables() {
        System.out.println("=== 2. VARIABLES Y TIPOS DE DATOS ===");

        // --- TIPOS PRIMITIVOS NUMÉRICOS ENTEROS ---
        byte ageByte = 25;                  // 8 bits  (-128 a 127)
        short postalCode = 10101;           // 16 bits (-32,768 a 32,767)
        int population = 1_500_000;         // 32 bits (soporta guiones bajos para legibilidad)
        long nationalDebt = 9876543210L;    // 64 bits (sufijo 'L')

        // --- TIPOS PRIMITIVOS NUMÉRICOS DECIMALES / PUNTO FLOTANTE ---
        float averageGrade = 8.75f;         // 32 bits (sufijo 'f')
        double piConstant = 3.14159265359;  // 64 bits (doble precisión, estándar)

        // --- TIPO CARÁCTER ---
        char initialLetter = 'J';           // 16 bits Unicode (comillas simples)

        // --- TIPO BOOLEANO ---
        boolean isEnrolled = true;          // true o false

        // --- CONSTANTES ---
        final String UNIVERSITY = "Keiser University"; // 'final' impide modificar el valor

        // --- INFERENCIA DE TIPO CON 'var' (Java 10+) ---
        var courseSemester = "Primer Semestre 2026";

        System.out.println("byte: " + ageByte);
        System.out.println("short: " + postalCode);
        System.out.println("int: " + population);
        System.out.println("long: " + nationalDebt);
        System.out.println("float: " + averageGrade);
        System.out.println("double: " + piConstant);
        System.out.println("char: " + initialLetter);
        System.out.println("boolean: " + isEnrolled);
        System.out.println("constante (final): " + UNIVERSITY);
        System.out.println("inferencia (var): " + courseSemester);
        System.out.println();
    }

    public void demonstrateBasicOOP() {
        System.out.println("=== 3. INTRODUCCIÓN A POO (Clases y Objetos) ===");

        // Creación de una instancia (objeto) de la clase Person
        Person student1 = new Person("José Daniel Narváez", 22, "Ingeniería de Software", true);

        // Invocación de métodos del objeto
        student1.greet();
        student1.displayInfo();

        // Creación de un segundo objeto con el constructor por defecto
        Person student2 = new Person();
        student2.setName("María González");
        student2.setAge(20);
        student2.setCareer("Sistemas de Información");
        student2.setActive(true);

        student2.greet();
        System.out.println("Edad del segundo estudiante obtenida con getter: " + student2.getAge() + " años.");
        System.out.println();
    }

    public void run() {
        demonstrateComments();
        demonstrateVariables();
        demonstrateBasicOOP();
    }
}
