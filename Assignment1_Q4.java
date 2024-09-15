// Write a Java program to find the largest of three numbers using nested if-else
// statements

import java.util.Scanner;

public class Assignment1_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 3 Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //System.out.println(Math.max(a, Math.max(b, c)));
        System.out.println("#################################");
        if(a>b && a>c){
            System.out.println(a);
        }else if (b>a && b>c) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}



