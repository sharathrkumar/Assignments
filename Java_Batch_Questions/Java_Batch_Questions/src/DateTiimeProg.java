import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTiimeProg {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        String formatter = dateTime.format(DateTimeFormatter.ofPattern("dd-mm-yyy hh:mm:ss a"));
        System.out.println("Local Date and Time Combined in Single Object: "+formatter);
    }
}
