import java.util.Scanner;
public class PracticeProblem9 {
    public static void main(String[] args) {
        // Write a Java program to convert a binary number to its decimal equivalent using a for
        // loop.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Binary Number: ");
        int binary=sc.nextInt();

        System.out.println("Decimal Conversion of " + binary + " = " + binTodec(binary));

    }

    static int binTodec(int binary){
        int decimal=0, pow=0;;

        for(int i=binary; i!=0 ; i/=10){
            int lastdigit=i%10;
            decimal=(int) (decimal + (lastdigit* Math.pow(2,pow)));//binary to decimal
            // binary=(int) (binary+(lastdigit*Math.pow(10, pow)));//decimal to binary
            pow++;
        }

        return decimal;

    }
}
