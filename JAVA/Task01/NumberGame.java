import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int chance = 5;
        int score = 0;
        boolean playAgain = true;
        System.out.println("Hey...You have "+chance+" chances to win this game...");
        while (playAgain){
            boolean guess = false;
            int rand_int = random.nextInt(100)+1;
            for (int i=0; i<chance; i++){
                System.out.println("guess the number..");
                int user = scanner.nextInt();
                if(user==rand_int){
                    System.out.println("You Won..!");
                    score++;
                    break;
                } else if (user<rand_int) {
                    System.out.println("Too low..!");
                } else if (user>rand_int) {
                    System.out.println("Too High..!");
                }

            }
            if (guess==true){
                System.out.println("Sorry you lost your chances.The number is "+rand_int);
            }
            System.out.println("Do you want to play again(y/n)");
            String pA = scanner.next();
            playAgain = pA.equals("y");
            System.out.println("Your score :"+score);
            System.out.println("Have a nice day...");
        }



    }
}
