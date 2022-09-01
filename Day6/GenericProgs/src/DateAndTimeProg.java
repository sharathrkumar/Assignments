import java.time.*;
import  java.time.format.DateTimeFormatter;

public class DateAndTimeProg {

    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd");
        String formatDate = todayDate.format(format);
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDateMonth = todayDate.format(form);
        String particularDate = LocalDate.of(2000,8,14).format(form);
        LocalDate day1 = LocalDate.of(2012,12,12);
        LocalDate day2 = LocalDate.of(2012,12,12);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalDate birthday = LocalDate.of(2022,8,18);

        System.out.println("------------------------------");
        System.out.println("1.Today's Date: " +formatDate);
        System.out.println("------------------------------");
        System.out.println("2.Today's Date-Month-Year+Day: " +formatDateMonth+"-"+todayDate.getDayOfWeek());
        System.out.println("------------------------------");
        System.out.println("3.Particular Date: "+ particularDate);
        System.out.println("------------------------------");
        if(day1.isEqual(day2))
            System.out.println("4.Both the dates are Same.");
        else
            System.out.println("4.Both the dates are not Same.");
        System.out.println("------------------------------");
        if(birthday.isEqual(todayDate))
            System.out.println("5.Today is Your Birthday");
        else
            System.out.println("5.Today is not your Birthday");
        System.out.println("------------------------------");
        if (day1.isLeapYear())
            System.out.println("6.This year is Leap Year");
        else
            System.out.println("6.This year is not a Leap Year");
        System.out.println("------------------------------");
        System.out.println("7.Current Time: "+ LocalTime.now().format(timeFormatter));
        System.out.println("------------------------------");
        System.out.println("8.Current Time: "+ LocalTime.now().plusHours(7).format(timeFormatter));
        System.out.println("------------------------------");
        System.out.println("9.Date Before One Year: "+ todayDate.minusYears(1).format(form));
        System.out.println("  Date After One Year: "+ todayDate.plusYears(1).format(form));
        System.out.println("------------------------------");
    }
}
