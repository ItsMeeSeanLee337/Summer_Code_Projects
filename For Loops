import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Welcome to the multiplication tables app. Type 1 if you would like to continue, or 0 to stop");
    int choice = console.nextInt();
    while (choice == 1)
    {
    System.out.println("Please enter a number to display its multiplication tables:");
    int user = console.nextInt();
    int i;
    System.out.println("Please enter another number for how many tables you would like to display:");
    int table = console.nextInt();
    for (i = 1; i <= table; i++)
    {
      int sum = (i * user);
      System.out.println(user + " x " + i + " = " + sum);
    }
    System.out.println("Please enter 1 if you would like to continue, 0 if you wish to end");
    choice = console.nextInt();
    }
    console.close();
  }
}
