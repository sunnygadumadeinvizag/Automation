package HT9_dateTimeAssignment;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.function.Predicate;

public class DateTimeAssignment {

    public static void main(String[] args) {
        //given date
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Date in YYYY-MM-DD format");
        String input = scanner.next();
        LocalDate date = LocalDate.parse(input);

        //predicate to check if the given date is yesterday date
        Predicate<LocalDate> verifyDate = date1 -> {
            LocalDate localDate = LocalDate.now().minus(1, ChronoUnit.DAYS);
            return date1.equals(localDate);
        };
        if (verifyDate.test(date)) {
            System.out.println("entered date is same as yesterday");
        } else {
            System.out.println("entered date is not same as yesterday");
        }


    }
}
