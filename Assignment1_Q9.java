// Write a Java program to check if a given number is a prime number using a for loop
// and if-else statements.

import java.util.Scanner;
public class Assignment1_Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false; //0 & 1 are not prime numbers
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n + " is a prime Number.");
        }else{
            System.out.println(n + " is not a Prime Number.");
        }
    }
}
