import java.util.Scanner;

public class NumberGuessing {
    static void main() {
        Scanner s = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int k = 5;// no.of attempts
        System.out.println("A number is chosen btw 1 and 100");
        System.out.println("you have total "+ k +" attempts to guess the number");
        for(int i = 0 ; i < k ; i++){
            System.out.println("Enter the guess: " );
          int guess = s.nextInt();
            // check conditons
            if(guess == number){
              System.out.println("congratulations! you guessed the correct number.");
              s.close();
              return;
          }else if (guess < number){
                System.out.println("Nice try ! the number is greater than" + guess);
            }
            else{
                System.out.println("the number is less than " + guess);
            }
        }
        System.out.println("you've exhausted all attempts. The correct number was: " + number);
        s.close();
    }
}
