package weeks.two;

public class SessionTwo {
    // This is a simple Java Program that demonstrates the use of String class and its methods and conversions types
    public String fullName = "   José DANIEL NARVáez Flores ";
    private String upperCaseName = fullName.toUpperCase();
    private String lowerCaseName = fullName.toLowerCase();
    private String cleanedName = fullName.trim();
    public String ageStr = "34 años";

    public void printUpperCaseName() {
        System.out.println("Full Uppercase Name: " + this.upperCaseName);
    }

    public void printLowerCaseName() {
        System.out.println("Full Lowercase Name: " + this.lowerCaseName);
    }

    public void printCleanedName() {
        System.out.println("Full Cleaned Name: " + this.cleanedName);
    }

    public int getAge() {
        return Integer.parseInt(this.ageStr);
    }
}
