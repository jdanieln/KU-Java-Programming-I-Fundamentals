package weeks.five;

public class ProgrammingWorkshop extends  Workshop {

    public ProgrammingWorkshop(String title, int capacity) {
        super(title, capacity);
    }

    @Override
    public double feePerSeat() {
        return 12.0; // Fee per seat for the Programming Workshop
    }
}
