import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner(System.in);
    int secret = (int)((Math.random() * 10) + 1); 
    System.out.println(secret);
    System.out.println("Enter a guess between 1 and 10");
    int guess = console.nextInt();
    int subtraction = 1;
    int previousAttempts = 2;
    while (previousAttempts > 0)
    {
      if (checkGuess(guess, secret) == true)
      {
        System.out.println("Good job, You won!");
        previousAttempts = previousAttempts - 2;
      }
      else
      {
        if (previousAttempts == 1)
        {
          System.out.println("This is your last try!");
        }
        previousAttempts = previousAttempts - subtraction;
        System.out.println("Try Again: ");
        guess = console.nextInt();
      }
    }
  }
  public static boolean checkGuess(int guess, int secret)
  {
    if (guess == secret)
    {
      System.out.println("Your guess was correct!");
      return true;
    }
    else
    {
      System.out.println("Your guess was incorrect ");
      return false;
    }
  }
}
