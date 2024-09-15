
import java.util.*; 

public class PracticeProblem5 {
    public static void main(String[] args) {
        // Write a Java program to calculate the sum of the digits of a given number using a
        // while loop.

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=sc.nextInt();

        int sum=0;

        while(n!=0){
            int digit=n%10;
            sum += digit;
            n/=10;
        }
        System.out.println("Sum of Digits = " +sum);
    }
}
