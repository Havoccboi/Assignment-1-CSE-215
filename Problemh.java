import java.util.*;
import java.lang.*;
import java.io.*;


class Problemh
{
 

   public static void main (String [] args)
{
    System.out.println("Enter your weight in Pounds and height in inches");
     Scanner var = new Scanner(System.in);
      double x = var.nextDouble();
      double y = var.nextDouble();

    double Kg= x*0.45359237;
    double Meter = y*0.0254;


   double BMI= Kg/(Meter*Meter);


    System.out.println("The BMI is "+BMI);

}
}
  
 