// Write a Java program to calculate the sum of the digits of a given number using a
// while loop
import java.util.Scanner;

public class Assignment1_Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number: ");
        long N=sc.nextLong();
        N=Math.abs(N);
        long sum=0;
        while(N!=0){
            long rem=N%10;
            sum += rem;
            N=N/10;
        }
        System.out.println("sum of Digits = "+sum);
    }
}

