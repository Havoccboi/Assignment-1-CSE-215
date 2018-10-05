import java.util.*;
import java.lang.*;
import java.io.*;

public class Problemc

{  
   public static void main(String[] args)
 {  
   System.out.println("Enter the Distance in Kilometer");
    Scanner var = new Scanner(System.in);
    double x= var.nextDouble();

   System.out.println("Enter the time required to travel eg. 16.5 minutes");
   Scanner vare = new Scanner(System.in);
    double y= vare.nextDouble();

   double mile= 1.6*x;
    double speed= (mile*60.0)/y;

System.out.println("The speed is " +speed+ " Mile/Hour");
    
 
  }

}