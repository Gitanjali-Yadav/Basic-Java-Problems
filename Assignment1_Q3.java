// Write a Java program to check whether a given year is a leap year or not using a series
// of if-else conditions.

import java.util.Scanner;

public class Assignment1_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        if(year%4==0){
            if (year%100==0) {
                if (year%400==0) {
                    System.out.println("Is Leap");
                }else{
                    System.out.println("Not Leap");
                }
            }else{
                System.out.println("Is Leap");
            }
        }else{
            System.out.println("Not Leap");
        }
    }
}

 //rules->
        //year%4==0 -> leap
        //year%4,100,400 -> leap
        //year%4,100 -> not leap
        //year%4,400 -> not leap