import java.time.*;

public class Event {
    private Availability availability;
    private String name;
    private LocalDateTime startTime;

    public Event(Availability availability, String name, LocalDateTime startTime) {
        this.availability = availability;
        this.name = name;
        this.startTime = startTime;
    }


}
