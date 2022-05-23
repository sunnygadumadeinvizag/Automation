package HT9_dateTimeAssignment;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

public class CurrentTimeZoneWise {


    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("local time is " + localDateTime);

        Supplier<LocalDateTime> zonedDateTimeSupplier = () -> {
            return LocalDateTime.now(ZoneId.of("America/New_York"));
        };

        System.out.println("EST time is " + zonedDateTimeSupplier.get());

        Supplier<LocalDate> localDateSupplier = () -> {
            LocalDate currentDate = LocalDate.now();
            DayOfWeek currentDay = currentDate.getDayOfWeek();
            if (currentDay.equals(DayOfWeek.THURSDAY)) {
                return LocalDate.now().plus(1, ChronoUnit.WEEKS);
            } else if (currentDay.getValue() > 4) {
                return currentDate.plus(1, ChronoUnit.WEEKS).minus(currentDay.getValue() - DayOfWeek.THURSDAY.getValue(), ChronoUnit.DAYS);
            } else {
                return currentDate.plus(1, ChronoUnit.WEEKS).plus(DayOfWeek.THURSDAY.getValue() - currentDay.getValue(), ChronoUnit.DAYS);
            }

        };
        LocalDate localDate = localDateSupplier.get();
        System.out.println("next " + localDate.getDayOfWeek() + " is on " + localDate);
    }
}
