import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Welcome to the asterisk display app. Type 1 if you would like to continue, or 0 to stop");
    int choice = console.nextInt();
    while (choice == 1)
    {
      System.out.println("Please enter how many asterisks you wish to display:");
      int end = console.nextInt();
      int i;
      for (i = 0; i <= end; i++)
      {
        System.out.print("*");
      }
    System.out.println(" ");
    System.out.println("Please enter 1 if you would like to continue, 0 if you wish to end");
    choice = console.nextInt();
    }
    console.close();
  }
}
