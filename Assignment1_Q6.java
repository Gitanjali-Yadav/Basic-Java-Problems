// Write a Java program to calculate the sum of the first N natural numbers using a for
// loop.

import java.util.Scanner;

public class Assignment1_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N: ");
        int N=sc.nextInt();
        int sum=0;
        for(int i=1 ; i<=N ;i++){
            sum+=i;
        }
        System.out.println("Sum = " + sum);
    }
}
