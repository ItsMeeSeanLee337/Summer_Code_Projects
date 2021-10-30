import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
    Scanner console = new Scanner(System.in);
    System.out.print("Please enter your email address: ");
    String email = console.next();
    while (email.indexOf("@") == -1)
    {
      System.out.println("Please reenter a valid email");
      email = console.next();
    }
    int endofemail = (email.indexOf("@"));
    int endofcom = (email.indexOf("."));
    String user = (email.substring(0,endofemail));
    String provider = (email.substring((endofemail + 1),endofcom));
    System.out.println("Email: " + email);
    System.out.println("Username: " + user);
    System.out.println("Email Provider: " + provider);
  }
}
