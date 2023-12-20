package taskfive;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();
              
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        Period agePeriod = Period.between(birthdate, LocalDate.now());

        System.out.println("Your age is: " +
                agePeriod.getYears() + " years, " +
                agePeriod.getMonths() + " months, and " +
                agePeriod.getDays() + " days.");
    }
}

