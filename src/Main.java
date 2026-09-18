import weeks.one.SessionOne;
import weeks.two.SessionTwo;
import weeks.three.SessionThree;

/**
 * Clase principal que integra y demuestra los contenidos de las Semanas 1, 2 y 3:
 * - Semana 1: Comentarios, Variables y fundamentos de POO.
 * - Semana 2: Cadenas (String), métodos y conversiones seguras.
 * - Semana 3: Estructuras de control (condicionales y bucles).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("🎓 KU - JAVA PROGRAMMING I: FUNDAMENTALS");
        System.out.println("=================================================\n");

        // --- SEMANA 1 ---
        System.out.println("-------------------------------------------------");
        System.out.println("📌 DEMOSTRACIÓN SEMANA 1: Variables, Comentarios y POO");
        System.out.println("-------------------------------------------------");
        SessionOne sessionOne = new SessionOne();
        sessionOne.run();

        // --- SEMANA 2 ---
        System.out.println("-------------------------------------------------");
        System.out.println("📌 DEMOSTRACIÓN SEMANA 2: Cadenas (String) y Conversión");
        System.out.println("-------------------------------------------------");
        SessionTwo sessionTwo = new SessionTwo();
        sessionTwo.printUpperCaseName();
        sessionTwo.printLowerCaseName();
        sessionTwo.printCleanedName();

        String secondFullName = "Diego Guevara Gonzalez";
        boolean isNameEqual = sessionTwo.fullName.equals(secondFullName);
        System.out.println("Is the full name equal to the second full name? " + isNameEqual);

        // getAge() ahora parsea correctamente la cadena "34 años" sin lanzar excepción
        System.out.println("Edad duplicada (getAge() * 2): " + (sessionTwo.getAge() * 2));

        sessionTwo.demonstrateStringMethods();
        sessionTwo.demonstrateTypeConversions();

        // --- SEMANA 3 ---
        System.out.println("-------------------------------------------------");
        System.out.println("📌 DEMOSTRACIÓN SEMANA 3: Estructuras de Control");
        System.out.println("-------------------------------------------------");
        SessionThree sessionThree = new SessionThree();
        sessionThree.run();

        System.out.println("=================================================");
        System.out.println("✅ Ejecución completada exitosamente.");
        System.out.println("=================================================");
    }
}
