import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        //all sales people get a payment of $1000 a week.
        //Sales people who exceed 10 sales get an additional bonus of $250.

        //initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        //get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();
        //quick detour for the bonus earners
        if(sales>quota){
            salary = salary + bonus;
        }
        System.out.println("The employee's pay is $" + salary);

    }
}
