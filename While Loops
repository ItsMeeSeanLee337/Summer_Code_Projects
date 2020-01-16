import java.util.Scanner;
class Main 
{
  public static void main (String[] args){
    Scanner console = new Scanner (System.in);
    System.out.println ("Please enter 1 if you would like to begin, 0 if you wish to end");
    int choice = console.nextInt();
    while (choice == 1)
    {
      System.out.println ("Please enter your first positive number");
        double n1 = console.nextDouble();
          while (n1 <= 0)
          {
            System.out.println ("Only positive numbers can be used. Please reenter your first number:");
            n1 = console.nextDouble();
          }
      System.out.println ("Please enter your second positive number");
        double n2 = console.nextDouble();
          while (n2 <= 0)
          {
            System.out.println ("Only positive numbers can be used. Please reenter your second number:");
            n2 = console.nextDouble();
          }
      System.out.println ("Please enter your third positive number");
        double n3 = console.nextDouble();
          while (n3 <= 0)
          {
            System.out.println ("Only positive numbers can be used. Please reenter your third number:");
            n3 = console.nextDouble();
          }
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
      System.out.println ("Please enter 1 if you would like to continue, 0 if you wish to end");
      choice = console.nextInt(); 
    } 
  }
}
