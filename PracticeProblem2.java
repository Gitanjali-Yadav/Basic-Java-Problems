import java.util.Scanner;

public class PracticeProblem2 {
    public static void main(String[] args) {
        
        //Write a Java program to check whether a given number is an Armstrong number using
        //a for loop and if-else statements.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        int ognum=n;
        int counter=countDigits(n);

        // boolean flag=false;

        int sum=0, add=0;

        for(int num=n; num!=0 ; num/=10){
            int digit=num%10;
            int pow = (int)Math.pow(digit, counter);
            add+=pow;
        }
        // while(n!=0){
        //     int digit=n%10;//3,5,1
        //     int result = (int)Math.pow(digit, counter);//result=3^3=27 , result=5^3=125, result=1^3=1
        //     sum=sum+result;//0,27,152,153
        //     n=n/10;//n=153,15,1
        // }
        if(add==ognum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }

    }

    static int countDigits(int n){
        int counter=0;

        int digits =  String.valueOf(n).length();
        // while(n!=0){
        //     int rem=n%10;
        //     n=n/10;
        //     counter++;
        // }
        return digits;
    }
}
