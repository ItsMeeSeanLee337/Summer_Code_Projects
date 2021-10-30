import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Welcome to the number display app. Type 1 if you would like to continue, or 0 to stop");
    int choice = console.nextInt();
    while (choice == 1)
    {
    System.out.println("Please enter a start number:");
    int start = console.nextInt();
    int i;
    System.out.println("Please enter an end number");
    int end = console.nextInt();
    while (end <= start)
    {
      System.out.println("The starting number must be less than the end number. Please retype the start number");
      start = console.nextInt();
      System.out.println("Please retype an end number");
      end = console.nextInt();
    }
    for (i = start; i <= end; i++)
    {
      System.out.println(i);
    }
    System.out.println("Please enter 1 if you would like to continue, 0 if you wish to end");
    choice = console.nextInt();
    }
    console.close();
  }
}
