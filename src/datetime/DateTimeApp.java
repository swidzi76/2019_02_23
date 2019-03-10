package datetime;


// ZADANIE 1
// Za pomocą klasy Calendar stwórz obiekt klasy Date,
// który reprezentuje datę i godzinę Twoich urodzin. Wyświetl ją na konsolę.

// ZADANIE 2
// Wyświetl na konsoli datę z pkt 1 z nazwą miesiąca i nazwą dnia tygodnia.

// ZADANIE 3
// Wyświetl na konsoli datę z pkt 1, ale uwzględniając strefę czasową: Tokio w Japonii i Hawaii w USA
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeApp {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1976, 11, 26);
        Date date = calendar.getTime();
        System.out.println(date);
        TimeZone tz = TimeZone.getDefault();
        System.out.println(tz.getDisplayName());
        //calendar.setTimeZone(0);
    }
}
