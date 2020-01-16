import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner(System.in);
    int[] numarray = new int[10];
    for (int i = 0; i < numarray.length; i++)
    {
      System.out.print("Please enter an even or odd number: ");
      numarray[i] = console.nextInt();
    }
    int esum = 0;
    int osum = 0;
    System.out.print("Even: ");
    for (int i = 0; i < numarray.length; i++)
    {
      if ((numarray[i] % 2) == 0)
      {
        System.out.print(numarray[i] + ", ");
        esum ++;
      }
    }
    System.out.println(" ");
    System.out.print("Odd: ");
    for (int i = 0; i < numarray.length; i++)
    {
      if ((numarray[i] % 2) > 0)
      {
        System.out.print(numarray[i] + ", ");
        osum ++;
      }
    }
    System.out.println(" ");
    System.out.println("Total Even: " + esum);
    System.out.println("Total Odd: " + osum);
    double epercent = (esum * 10);
    double opercent = (osum * 10);
    System.out.println("Percentage Even: " + epercent + "%");
    System.out.println("Percentage Odd: " + opercent + "%");
    console.close();
  }
}
