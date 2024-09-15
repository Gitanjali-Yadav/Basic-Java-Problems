import java.util.*;
public class PracticeProblem8 {
    public static void main(String[] args) {
        // Write a Java program to calculate the simple interest based on user input for principal,
        // rate of interest, and time period using if-else statements for input validation.

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Principle Amount : ");
        int amt=sc.nextInt();
        System.out.println("Enter Rate of Interest : ");
        double rate=sc.nextDouble();
        System.out.println("Enter Time in years    : ");
        int time=sc.nextInt();

        double SI = (amt*rate*time)/100;

        System.out.println("Interest Earned = " + SI);
        System.out.println("total Amount = " + (SI+amt));

    }
}
