package weeks.four;

public class StudyRoom {
    private final int capacity;
    private int reservedSeats;

    public StudyRoom(int capacity) {
        this.capacity = capacity;
        this.reservedSeats = 0;
    }

    public boolean reserve(int seats) {
        int availableSeats = this.capacity - this.reservedSeats;
        if (seats > 0 && availableSeats >= seats) {
            this.reservedSeats += seats;
            return true;
        } else {
            return false;
        }
    }
}
