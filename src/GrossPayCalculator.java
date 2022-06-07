import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        //1.get the number of hours worked
        System.out.println("Enter the number of hours worked.");
        Scanner scan = new Scanner(System.in);
        int numOfHours = scan.nextInt();
        //2.get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double payRate = scan.nextDouble();
        scan.close();
        //3.Multiply hours and pay rate
        double grossPay = numOfHours * payRate;
        System.out.println("The employee's total gross pay per year is $ " + grossPay);
    }
}
