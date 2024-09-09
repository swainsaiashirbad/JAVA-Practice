package java8.DateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(1998, 11, 26);
//        System.out.println(currentTime);
//        System.out.println(today);
        Period age = Period.between(birth, today);
        System.out.println(""+age.getYears()+" year"+"/ "+ age.getMonths()+" Month"+"/ " +age.getDays()+" Days");
    }
}
