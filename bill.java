import java.io.*;
class bill
{
 public static void main(String args[])
 {
   int unit=2,qt=4;
   double dis=2.50,total;
   total=(unit*qt)-dis;
   System.out.println("Unit cost of Produts "+unit);
   System.out.println("Quantity of Produts "+qt);
   System.out.println("Discount on the Produts "+dis);
   System.out.println("Total =  "+total);
 }
}