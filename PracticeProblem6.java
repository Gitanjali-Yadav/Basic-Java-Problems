import java.util.Scanner;
public class PracticeProblem6 {
    public static void main(String[] args) {
        
        // Write a Java program to count the number of vowels and consonants in a given string
        // using a for loop and switch statement.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        int vowel=0, consonant=0;

        for(int i=0;i<=str.length()-1;i++){
            char currentChar= str.charAt(i);
            if(Character.isLetter(currentChar)){
                currentChar=Character.toLowerCase(currentChar);

                switch (currentChar) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    vowel++;
                    break;   
                    default:
                    consonant++;
                    break;
                }
            }
            
            
        }

        System.out.println("Vowels = " + vowel + "\nConsonants = " + consonant);
    }
}
