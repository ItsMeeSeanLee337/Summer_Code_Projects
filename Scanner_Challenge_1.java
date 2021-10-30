import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {
   System.out.println("Initial Currency:");
   Scanner in = new Scanner (System.in); 
   double sara = in.nextDouble();
    //initial amount
    double quarter = 0.25;
    double dime = 0.10;
    double nickel = 0.05;
    double penny = 0.01;
    double quarteramount = (sara / quarter);
    double quarteramount2 = Math.floor(quarteramount);
    //Math.floor(x) will always round whatever is in x downwards
    double quartermodulo = (sara % quarter);
    //the first quartermodulo requares a modulous division, all other modulo doubles can take information from previous doubles
    double dimeamount = (quartermodulo / dime);
    double dimeamount2 = Math.floor(dimeamount);
    double dimemodulo = (sara - quarter * quarteramount2 - dime * dimeamount2);
    double nickelamount = (dimemodulo / nickel);
    double nickelamount2 = Math.floor(nickelamount);
    double nickelmodulo = (sara - quarter * quarteramount2 - dime * dimeamount2 - nickel * nickelamount2);
    double pennyamount = (nickelmodulo/penny);
    double pennyamount2 = Math.round (pennyamount);
    //Math.round will round upwards or downwards
    System.out.println(quarteramount2 + " quarters, " + dimeamount2 + " dimes, " + nickelamount2 + " nickels, " + pennyamount2 + " pennies");
  } 
} 
