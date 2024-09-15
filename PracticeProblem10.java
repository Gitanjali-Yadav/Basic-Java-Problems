import java.util.*;

public class PracticeProblem10 {
    public static void main(String[] args) {
        // Write a Java program to input a month number and year, and output the number of
        // days in that month using a switch statement.

        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int month;
        do{
            do{
                System.out.println("Enter month (1-12) : ");
                month=sc.nextInt();
            }while(month>12);
            
    
            System.out.println("Enter year (yyyy) : ");
            int year=sc.nextInt();
    
            int days=0;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 12:
                case 10:
                    days=31;
                    break;
    
                case 4:
                case 6:
                case 9:
                case 11:
                    days=30;
                    break;
                case 2:
                    if(isleapYear(year)){
                        days=29;
                    }else{
                        days=28;
                    }
                    break;
                default:
                    break;
            }

            System.out.println("The Month " + month + " of Year " + year + " has " + days + " days.");
            flag=true;


        }while(flag);
       
    }
    static boolean isleapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
