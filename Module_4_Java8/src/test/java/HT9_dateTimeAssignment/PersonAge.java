package HT9_dateTimeAssignment;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Function;

public class PersonAge {

    public static void main(String[] args) {

        //age calculator
        System.out.println("Enter person Date of birth in YYYY-MM-DD format");

        Scanner dob = new Scanner(System.in);
        String birth = dob.next();

        LocalDate birthDate = LocalDate.parse(birth);


        Function<LocalDate, int[]> ageCalculator = date -> {
            LocalDate currentDate = LocalDate.now();
            int currentYear = currentDate.getYear();
            int birthYear = date.getYear();
            int[] dateArray = new int[3];
            dateArray[0] = currentYear - birthYear;
            dateArray[1] = currentDate.getMonth().getValue() - date.getMonth().getValue();
            dateArray[2] = currentDate.getDayOfYear() - birthDate.getDayOfYear();


            return dateArray;
        };

        int[] ageArray = ageCalculator.apply(birthDate);

        System.out.println("Age of person is " + ageArray[0] + " years " + ageArray[1] + " months " + ageArray[2] + " days ");
    }
}
