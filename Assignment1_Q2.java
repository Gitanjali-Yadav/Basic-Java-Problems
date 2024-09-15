// Write a Java program that takes a student's score as input and assigns a grade (A, B,
// C, D, F) using nested if-else statements.

import java.util.Scanner;

public class Assignment1_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Score out of 100: ");
        int score=sc.nextInt();
        if(score<35 && score>=0){
            System.out.println("F Grade");
        }else if (score>=35 && score<=40) {
            System.out.println("D Grade");
        }else if(score>40 && score<=50){
            System.out.println("C Grade");
        }else if (score>50 && score<=70) {
            System.out.println("B Grade");
        }else if (score>70 && score<=100){
            System.out.println("A Grade");
        }else{
            System.out.println("Invalid Score !!");
        }
    }
}
