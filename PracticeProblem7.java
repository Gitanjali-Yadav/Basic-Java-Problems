import java.util.Scanner;

public class PracticeProblem7 {
    public static void main(String[] args) {
        // Write a Java program to print a pyramid pattern of stars using nested for loops.
        //             *
        //         *       *
        //     *       *       *
        // *       *       *       *
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int s=n-i;s>0;s--){
                System.out.print(" ");
            }
            for(int star=1 ; star<=i;star++){
                System.out.print("* ");
            }
        
            System.out.println();
        }

    }
}
