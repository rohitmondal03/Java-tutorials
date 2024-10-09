import java.time.LocalDateTime;

public class DateAndTime {
    public void  printDateAndTime(){
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("Local date: " + dateTime.toLocalDate());
        System.out.println("Local time" + dateTime.toLocalTime());

//        more are there = "https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html"
    }
}
