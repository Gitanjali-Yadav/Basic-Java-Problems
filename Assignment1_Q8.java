// Write a Java program to print the first N numbers in the Fibonacci series using a for
// loop.

import java.util.Scanner;

public class Assignment1_Q8 {
    public static void main(String[] args) {
        int first=0,second=1,next;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(first + " , ");
            next=first + second;
            first=second;
            second=next;
        }
    }
}
