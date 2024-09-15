import java.util.Scanner;

public class PracticeProblem1 {
    public static void main(String[] args) {
        // Write a Java program to reverse a given number using a while loop.

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        
        StringBuilder sb=new StringBuilder();
        sb.append(n);
        sb.reverse();
        int reversednumber=Integer.parseInt(sb.toString());
        System.out.println(reversednumber);


        // int reverse=0;
        // while(n!=0){
        //     int rem=n%10;
        //     reverse= (reverse*10)+rem;
        //     n=n/10;
        // }
        // System.out.println("Reverse = " + reverse);
        
    }
}
