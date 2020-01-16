import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner(System.in);
    System.out.println("How many American dollars would you like to convert: ");
    double dollars = console.nextDouble();
    System.out.println("Would you like to convert to Yuan, Ringgit, or Both: ");
    String st1 = console.next();
    String st2 = "Yuan";
    String st3 = "Ringgit";
    String st4 = "Both";
    if (st1.equals(st2)) //Compares the content of the strings, case sensitive
    {
      System.out.println(dollars + " dollars is equal to " + dollarYuan(dollars)); //Method call
    }
    else if (st1.equals(st3))
    {
      System.out.println(dollars + " dollars is equal to " + dollarRinggit(dollars));
    }
    else if (st1.equals(st4))
    {
      System.out.println(dollars + " dollars is equal to " + dollarYuan(dollars));
      System.out.println(dollars + " dollars is equal to " + dollarRinggit(dollars));
    }
  }
  //Method declaration: modifier binding return-type method-name(parameter) {
  //}
  public static double dollarYuan(double dollars) 
  {
    double yuan = dollars * 7.02;
    return yuan;
    //Return statement sends information back to the main method
  }  
  public static double dollarRinggit(double dollars)
  {
    double ringgit = dollars * 4.19;
    return ringgit;
  }
}
