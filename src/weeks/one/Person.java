package weeks.one;

/**
 * Representa una persona para demostrar conceptos básicos de Programación Orientada a Objetos (POO):
 * - Clases y Objetos
 * - Atributos (estado)
 * - Métodos (comportamiento)
 * - Encapsulamiento (modificadores de acceso private/public)
 * - Constructores
 */
public class Person {
    // --- Atributos privados (Encapsulamiento) ---
    private String name;
    private int age;
    private String career;
    private boolean active;

    // --- Constructor por defecto ---
    public Person() {
        this("Desconocido", 0, "Sin especificar", false);
    }

    // --- Constructor sobrecargado con parámetros ---
    public Person(String name, int age, String career, boolean active) {
        this.name = name;
        this.age = age;
        this.career = career;
        this.active = active;
    }

    // --- Métodos de comportamiento ---
    public void greet() {
        System.out.println("¡Hola! Soy " + this.name + " y estudio " + this.career + ".");
    }

    public void displayInfo() {
        System.out.println("----- Ficha de Estudiante -----");
        System.out.println("Nombre : " + this.name);
        System.out.println("Edad   : " + this.age + " años");
        System.out.println("Carrera: " + this.career);
        System.out.println("Activo : " + (this.active ? "Sí" : "No"));
        System.out.println("-------------------------------");
    }

    // --- Getters y Setters ---
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
