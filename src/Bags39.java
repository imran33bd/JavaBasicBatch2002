import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Bags39 {
    public static void main(String[] args) {
        System.out.println("showing Date");
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
        LocalDateTime myObj1 = LocalDateTime.now();
        System.out.println(myObj1);

        System.out.println("Before formatting: " + myObj1);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myObj1.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
