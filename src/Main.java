import weeks.two.SessionTwo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    SessionTwo sessionTwo = new SessionTwo();
    sessionTwo.printUpperCaseName();
    sessionTwo.printLowerCaseName();
    sessionTwo.printCleanedName();

    String secondFullName = "Diego Guevara Gonzalez";

    boolean isNameEqual = sessionTwo.fullName.equals(secondFullName);

    System.out.println("Is the full name equal to the second full name? " + isNameEqual);

    System.out.println(sessionTwo.getAge() * 2);
}
