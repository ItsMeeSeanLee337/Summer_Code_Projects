import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    System.out.println("Please type an integer to convert from celsius to farenheit");
    Scanner in = new Scanner (System.in); 
    double degreec = in.nextDouble();
    double conversion1 = (degreec * 9);
    double conversion2 = (conversion1 / 5);
    double degreef = (conversion2 + 32);
    System.out.println(degreec + " degrees celsius is " + degreef);
    if (degreef > 32)
    {
      System.out.println("It is above the freezing point");
    }
    else if (degreef == 32)
    {
      System.out.println("It is at the freezing point");
    }
    else 
    {
      System.out.println("It is below the freezing point");
    }
  }
}
