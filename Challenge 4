import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Welcome to the calculator app. Type 1 if you would like to continue, or 0 to stop");
    int choice = console.nextInt();
    while (choice == 1)
    // Loops only ends when the user chooses to
    {
      System.out.println("Please enter your first number");
        double n1 = console.nextDouble();
      System.out.println("Please enter your second number");
        double n2 = console.nextDouble();
      System.out.println(
          "Please type 1 if you would like to add, 2 if you would like to subtract, 3 if you would like to multiply, or 4 if you would like to divide");
      double operation = console.nextDouble();
      //All lines after this check which operation the user chose to use and how it should process that information
      if (operation == 1) {
        double sum = (n1 + n2);
        System.out.println(n1 + " + " + n2 + " = " + sum);
      } 
      else if (operation == 2) 
      {
        double sum = (n1 - n2);
        System.out.println(n1 + " - " + n2 + " = " + sum);
      } 
      else if (operation == 3) 
      {
        double sum = (n1 * n2);
        System.out.println(n1 + " x " + n2 + " = " + sum);
      } 
      else if (n2 == 0) 
      {
        System.out.println(n1 + " / " + n2 + " = undefined");
      } 
      else 
      {
        double sum = (n1 / n2);
        System.out.println(n1 + " / " + n2 + " = " + sum);
      }
      System.out.println("Please enter 1 if you would like to continue, 0 if you wish to end");
      choice = console.nextInt();
      // Allows user to run the loop again if they wish to do so
    }
    console.close();
    // Closes the console Scanner
  }
}
