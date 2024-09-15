import java.util.Scanner;
public class PracticeProblem4 {
    public static void main(String[] args) {
        
        // Write a Java program for a number guessing game where the user has to guess a
        // randomly generated number between 1 and 100 using a do-while loop.
        boolean flag=true;
        System.out.println("Welcome to the Number Guessing Game! \nI have Picked a number between 1 and 100. Can you guess it?");
        Scanner sc=new Scanner(System.in);
        int random=randomNumber();
        int attempts=0;
        do{
            System.out.print("Enter your guess: ");
            int guess=sc.nextInt();
            attempts++;

            if(guess==random){
                System.out.println("Congratulations! You have guessed the number in " + attempts + " Attempts!");
                flag=false;
            }else{
                if(guess<random){
                    System.out.println("Too Low! Try again!");
                }else{
                    System.out.println("Too High! Try again!");
                }
            }
        }while(flag);

    }

    static int randomNumber(){
        int random;
        
        random=(int)(Math.random()*100)+1;
       
        return random;
    }
}

