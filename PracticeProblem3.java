import java.util.Scanner;

public class PracticeProblem3 {
    public static void main(String[] args) {
        
        // Write a Java program to check if a given string is a palindrome using a for loop.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String: ");
        String s= sc.next();

        String reversed="";

        for(int i=s.length()-1; i>=0;i--){
           char ch = s.charAt(i);
           reversed= reversed+ch;
        }
        if(reversed.equalsIgnoreCase(s)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
