import java.util.*;
import java.lang.*;
import java.io.*;



class Probleme
  {

     public static void main (String [] args)
  { 

    System.out.println("Enter the celcius Value " );
    Scanner var = new Scanner (System.in);

    double celcius = var.nextDouble() ;
  double far =(9.0/5)*celcius + 32;

    System.out.println("The fahrenheit value is " +far);
   }
}