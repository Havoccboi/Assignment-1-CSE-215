import java.util.*;
import java.lang.*;
import java.io.*;


class Problemj
{
  public static void main (String[] args)
  {  System.out.println("Enter the driving distance ");
     Scanner var= new Scanner(System.in);
     double distance = var.nextDouble();

    System.out.println("Enter miles per gallon");
   double miles_per_gallon = var.nextDouble();

 System.out.println("Enter Price per gallon");
  double price_per_gallon = var.nextDouble();


double gal = distance/miles_per_gallon;
  double cost=gal*price_per_gallon;

  System.out.println("The Cost of driving is = " +cost);
} 

}