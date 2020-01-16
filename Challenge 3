import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner (System.in);
    System.out.println ("Please enter your first number");
      double n1 = console.nextDouble();
    System.out.println ("Please enter your second number");
      double n2 = console.nextDouble();
    System.out.println ("Please enter your third number");
      double n3 = console.nextDouble();
    if ((n1 > n2) & (n1 > n3))
    {
      if (n2 > n3)
      {
        System.out.println (n1 + " , " + n2 + " , " + n3);
      }
      else
      {
        System.out.println (n1 + " , " + n3 + " , " + n2);
      }    
    }
    else if ((n1 < n2) & (n1 < n3))
    {
      if (n2 > n3)
      {
        System.out.println (n2 + " , " + n3 + " , " + n1);
      }
      else
      {
        System.out.println (n3 + " , " + n2 + " , " + n1);
      }   
    }
    else if ((n1 < n2) & (n1 > n3))
    {
      System.out.println (n2 + " , " + n1 + " , " + n3);
    }
    else if ((n1 < n3) & (n1 > n2))
    {
      System.out.println (n3 + " , " + n1 + " , " + n2);
    }
    else if ((n1 == n2) & (n1 == n3))
    {
      System.out.println (n1 + " , " + n2 + " , " + n3);
    }
    else if ((n1 == n2) & (n1 > n3))
    {
      System.out.println (n1 + " , " + n2 + " , " + n3);
    }
    else if ((n1 == n2) & (n1 < n3))
    {
      System.out.println (n3 + " , " + n2 + " , " + n1);
    }
    else if ((n1 == n3) & (n1 < n2))
    {
      System.out.println (n2 + " , " + n1 + " , " + n3);
    }
    else if ((n1 == n3) & (n1 > n2))
    {
      System.out.println (n1 + " , " + n3 + " , " + n2);
    }
  }
}
