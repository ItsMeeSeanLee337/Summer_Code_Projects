import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner(System.in);
    int[] numarray = new int[5];
    for (int i = 0; i < numarray.length; i++)
    {
      System.out.print("Please enter any number: ");
      numarray[i] = console.nextInt();
    }
    System.out.print("Numbers divisible by 3: ");
    for (int i = 0; i < numarray.length; i++)
    {
      if ((numarray[i] % 3) == 0)
      {
        System.out.print(numarray[i] + ", ");
      }
    }
    System.out.println(" ");
    System.out.print("Numbers indivisible by 3: ");
    for (int i = 0; i < numarray.length; i++)
    {
      if ((numarray[i] % 3) != 0)
      {
        System.out.print(numarray[i] + ", ");
      }
    }
  }
}
