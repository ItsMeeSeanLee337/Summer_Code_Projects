import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner console = new Scanner(System.in);
    System.out.println("Please enter your Social Security Number:");
    String ss = console.next();
    int ssnum = (ss.length()); 
    while (ssnum != 9)
    {
      System.out.println("That social security number is invalid, please retype your social security number");
      ss = console.next();
      ssnum = (ss.length()); 
    }
    System.out.println("Your Social Security Number is: " + ss.substring(0,3) + " - " + ss.substring(3,5) + " - " + ss.substring(5,9));
    console.close();
  }
}
