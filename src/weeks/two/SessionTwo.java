package weeks.two;

import java.util.Arrays;

/**
 * =========================================================================
 * SEMANA 2: MANIPULACIÓN DE CADENAS (String) Y CONVERSIÓN DE TIPOS
 * =========================================================================
 * Mejoras aplicadas:
 * 1. Corrección del error NumberFormatException en la extracción de edad.
 * 2. Dinamismo en los métodos: ya no dependen de variables estáticas desfasadas.
 * 3. Constructores sobrecargados (por defecto y personalizado).
 * 4. Ampliación de métodos útiles de la clase String (split, replace, contains, etc.).
 * 5. Demostración de conversiones seguras entre tipos (Parsing y Casting).
 * =========================================================================
 */
public class SessionTwo {
    // Mantenemos fullName público para retrocompatibilidad con Main.java existente
    public String fullName;
    public String ageStr;

    // Constructor por defecto
    public SessionTwo() {
        this("   José DANIEL NARVáez Flores ", "34 años");
    }

    // Constructor con parámetros
    public SessionTwo(String fullName, String ageStr) {
        this.fullName = fullName;
        this.ageStr = ageStr;
    }

    // --- Métodos originales mejorados (calculan dinámicamente sobre fullName) ---

    public String getUpperCaseName() {
        return (this.fullName != null) ? this.fullName.toUpperCase() : "";
    }

    public String getLowerCaseName() {
        return (this.fullName != null) ? this.fullName.toLowerCase() : "";
    }

    public String getCleanedName() {
        return (this.fullName != null) ? this.fullName.trim() : "";
    }

    public void printUpperCaseName() {
        System.out.println("Full Uppercase Name: " + getUpperCaseName());
    }

    public void printLowerCaseName() {
        System.out.println("Full Lowercase Name: " + getLowerCaseName());
    }

    public void printCleanedName() {
        System.out.println("Full Cleaned Name: " + getCleanedName());
    }

    /**
     * Obtiene la edad numérica a partir de una cadena de texto (ej. "34 años").
     * Extrae de forma segura sólo los dígitos numéricos para evitar NumberFormatException.
     *
     * @return edad como entero, o 0 si no se encuentra un valor válido.
     */
    public int getAge() {
        if (this.ageStr == null || this.ageStr.isBlank()) {
            return 0;
        }

        try {
            // Extrae únicamente los dígitos de la cadena (elimina ' años', espacios, etc.)
            String digitsOnly = this.ageStr.replaceAll("\\D+", "");
            if (digitsOnly.isEmpty()) {
                return 0;
            }
            return Integer.parseInt(digitsOnly);
        } catch (NumberFormatException e) {
            System.err.println("Error al parsear la edad desde: \"" + this.ageStr + "\". Detalle: " + e.getMessage());
            return 0;
        }
    }

    // --- Nuevos métodos y utilidades de la clase String ---

    public void demonstrateStringMethods() {
        System.out.println("=== MÉTODOS ADICIONALES DE String ===");
        String cleaned = getCleanedName();

        // 1. Longitud de la cadena
        System.out.println("1. Longitud (length): " + cleaned.length() + " caracteres");

        // 2. Primer y último caracter
        System.out.println("2. Primer carácter (charAt 0): " + cleaned.charAt(0));

        // 3. Substring (extraer una parte)
        if (cleaned.length() >= 4) {
            System.out.println("3. Primeros 4 caracteres (substring): " + cleaned.substring(0, 4));
        }

        // 4. Búsqueda con contains y startsWith
        System.out.println("4. ¿Contiene 'Daniel' (ignora mayúsculas/minúsculas)? " +
                cleaned.toLowerCase().contains("daniel"));
        System.out.println("   ¿Empieza con 'José'? " + cleaned.startsWith("José"));

        // 5. Reemplazo de caracteres o palabras
        System.out.println("5. Reemplazo (replace 'a' por '@'): " +
                cleaned.replace('a', '@').replace('A', '@'));

        // 6. División de cadena en arreglo (split)
        String[] words = cleaned.split("\\s+");
        System.out.println("6. División en palabras (split por espacios): " + Arrays.toString(words));
        System.out.println();
    }

    // --- Demostración de conversiones de tipo (Parsing & Formatting) ---

    public void demonstrateTypeConversions() {
        System.out.println("=== CONVERSIONES DE TIPO EN JAVA ===");

        // String a int / double
        String priceStr = "1250.75";
        double price = Double.parseDouble(priceStr);
        int roundedPrice = (int) price; // Casting explícito estrechante

        // Número a String
        int score = 95;
        String scoreStr = String.valueOf(score);

        System.out.println("String a double (Double.parseDouble): " + price);
        System.out.println("Double a int mediante casting explícito (int): " + roundedPrice);
        System.out.println("int a String (String.valueOf): " + scoreStr);
        System.out.println("Edad parseada limpiamente: " + getAge());
        System.out.println();
    }

    // --- Getters y Setters ---

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAgeStr() {
        return ageStr;
    }

    public void setAgeStr(String ageStr) {
        this.ageStr = ageStr;
    }
}
