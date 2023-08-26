import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random ra=new Random();
        int rannum=ra.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println(" Enter your guess (5 Attempts)");
        for(int i=1;i<=5;i++)
        {
            System.out.println("Attempt "+i);
            System.out.println(" Enter your guess ");
            int guess=sc.nextInt();
            if(guess==rannum){
                System.out.println("Congrats !! your guess is right");
                c=i;
                break;
            }
            else if(guess<rannum)
                System.out.println("The Number is higher");
            else if(guess>rannum)
                System.out.println("The number is lower");
        }
        switch(c){
            case 0:System.out.println("You Lost!!!!! ");
            System.out.println("Points = 0");
            System.out.println("The Random number was " + rannum);
            break;
            case 1:System.out.println("Points = 10");
            break;
            case 2:System.out.println("Points = 8");
            break;
            case 3:System.out.println("Points = 6");
            break;
            case 4:System.out.println("Points = 4");
            break;
            case 5:System.out.println("Points = 2");
            break;
            default:System.out.println("Error");
        }

    }
}