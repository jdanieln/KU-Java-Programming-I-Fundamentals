package weeks.five;

public abstract class Workshop {
    public String title;
    public int capacity;
    public int enrolled;

    public Workshop(String title, int capacity) {
        if (title == null || title.isEmpty() || capacity <= 0) {
            throw new IllegalArgumentException("Title must be non-empty and capacity must be positive.");
        }
        this.title = title.trim();
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public abstract double feePerSeat();

    public void decreaseCapacity(int requestedSeats) {
        if (requestedSeats <= 0) {
            throw new IllegalArgumentException("Requested seats must be positive.");
        }
        this.capacity -= requestedSeats;
    }

    public void checkEnrollment(int requestedSeats) {
        if (requestedSeats > this.capacity) {
            throw new RuntimeException("Enrollment rejected.");
        }
    }
}
