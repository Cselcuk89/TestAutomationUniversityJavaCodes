import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        /*
        *All sale people are expected to make at least 10 sales each week
        * for those who do, they receive a congratulatory message.
        * for those who don't, they are informed of how many sales they were short.
         */
        //initialize values we know
        int quota = 10;
        //get unknown values
        System.out.println("Enter the number of sales you made this week.");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();
        //make a decision n the path to take
        if (sales>=quota){
            System.out.println("Congrats!You've met you quota");
        }else{
            int salesShort = quota - sales;
            System.out.println("You did not make  your quota." +
                              "You were " + salesShort +" sales short");
        }

    }
}
