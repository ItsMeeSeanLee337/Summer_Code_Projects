import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner(System.in);
    int[] numarray = new int[10];
    //This line creates a new array with a size of 10
    //Arrays should be declared by variabletype[] arrayname = new variabletype[arraylength]
    for (int i = 0; i < numarray.length; i++)
    {
      numarray[i] = (i+1);
    }
    //Lines above create a for loop that fills an array
    for (int i = (numarray.length - 1); i < (numarray.length) & i >= 0; i--)
    {
      System.out.println(numarray[i]);
    }
    //Lines above print out the array in reverse
    console.close();
  }
}
