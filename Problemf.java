import java.util.*;
import java.lang.*;
import java.io.*;

class Problemf
{  
   public static void main (String [] args)

 {   System.out.println("Enter Subtotal and gratuity rate");
      Scanner var = new Scanner(System.in);
        double x = var.nextDouble();
        double y = var.nextDouble();
     double gratuity = (y*x)/100.0; 
     double subtotal = x + gratuity;

   System.out.println("The gratuity is = " +gratuity+ " and the subtotal is ="+subtotal);

   }
}