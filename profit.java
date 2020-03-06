import java.io.*;
class profit
{
 public static void main(String args[])
 {
   int sp = 200, cp = 300, pro, loss;
   if(sp>cp)
   {
     pro = sp-cp;
	 System.out.println("Profit is " + pro);
   }
   else
   {
    loss = cp-sp;
	System.out.println("loss is " + loss);
   }
 }  
}