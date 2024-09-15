// Write a Java program to check whether a given number is even or odd using an if-else
// statement.

import java.util.Scanner;

public class Assignment1_Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        // System.out.println(n + " is an " +((n%2==0) ? "Even" : "Odd") + " number.");
    }
}

