
// Write a Java program that takes two numbers and an operator (+, -, *, /) as input and
// performs the corresponding operation using a switch statement.

import java.util.Scanner;
public class Assignment1_Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Enter Operation: (+,-,*,/,%) ");
        char ch=sc.next().charAt(0);
        int result=0;
        switch (ch) {
            case '+':
               result=n1+n2;
                break;
                case '-':
               result=n1-n2;
                break;
                case '*':
               result=n1*n2;
                break;
                case '/':
               result=n1/n2;
                break;
                case '%':
               result=n1%n2;
                break;
            default:
            System.out.println("Invalid Choice");
                break;
        }
        System.out.println(n1 + " " + ch + " " + n2 + " =" + " " + result);
    }
}
