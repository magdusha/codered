import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Provide your first name: ");
        String FirstName = console.next();
        System.out.println("Provide your last name: ");
        String LastName = console.next();
        System.out.println("Provide your PESEL: ");
        long PESELin = console.nextLong();



        LocalDate today = LocalDate.now();

        System.out.println("Hello "+FirstName+" "+LastName+"!");

        if (PESELin / 10 % 2 == 0) {
            System.out.println("You are female");
        } else {
            System.out.println("You are male");
        }

        var BirthLong = PESELin / 100000;
        //System.out.println("Birthday :" + BirthLong);
        if (BirthLong / 1000 % 10 == 2 || BirthLong / 1000 % 10 == 3) {
            BirthLong = BirthLong + 20000000 - 2000;

        } else if (BirthLong / 1000 % 10 == 1 || BirthLong / 1000 % 10 == 0) {

            BirthLong = BirthLong + 19000000;

        }
        //System.out.println("You were born on :" + BirthLong);

        String BirthDate = String.valueOf(BirthLong);
        String BirthYear = BirthDate.substring(0, 4);
        String BirthMonth = BirthDate.substring(4, 6);
        String BirthDay = BirthDate.substring(6, 8);
        BirthDate = BirthYear + "-" + BirthMonth + "-" + BirthDay;
        LocalDate BirthDateLocal = LocalDate.parse(BirthDate);
        //System.out.println("You were born on :" + BirthDate);

        LocalDate DateToday = LocalDate.now();
        long diffInYEARS = ChronoUnit.YEARS.between(BirthDateLocal, DateToday);
        //System.out.println("Your are " + diffInYEARS);
        LocalDate LastBirthday = BirthDateLocal.plusYears(diffInYEARS);
        //System.out.println("Your last birthday was  on " + LastBirthday);
        LocalDate NextBirthday = LastBirthday.plusYears(1);
        System.out.println("Your next birthday is on " + NextBirthday);

        boolean isEqual = DateToday.isEqual(LastBirthday);
        if (isEqual == true) {
            System.out.println("Today is your birthday!!! ");
        } else {
            long NextBirthdayDiff = ChronoUnit.DAYS.between(DateToday, NextBirthday);
            System.out.println("So you birthday is in " + NextBirthdayDiff + " days");
        }
    }


}





