package weeks.five;

public class RoboticsWorkshop extends Workshop {
    public RoboticsWorkshop(String title, int capacity) {
        super(title, capacity);
    }

    @Override
    public double feePerSeat() {
        return 18.0; // Fee per seat for the Robotics Workshop
    }
}
