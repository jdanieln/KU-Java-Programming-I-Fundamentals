package weeks.six;

public class Students {
    private String[] fullNames = { "Erick Martinez", "Martha Ruiz", "Nicolás Campos", "Danilo Vilchez" };
    public Students() {
    }

    public void getOneStudent (int index) {
        if (index >= 0 && index < this.fullNames.length) {
            System.out.println(this.fullNames[index]);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds." + " Valid range is 0 to " + (this.fullNames.length - 1));
        }
    }

    public int getTotalStudents() {
        return this.fullNames.length;
    }
}
