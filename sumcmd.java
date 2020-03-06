import java.io.*;
class cmdsum
{
 public static void main(String args[])
 {
   /*int x,y;
   x=Integer.parseInt(args[0]);
   y=Integer.parseInt(args[1]);
   
   System.out.println("a+b=  "+(x+y)); */
   
   int sum=0;
   for(int i=0; i<args.length; i++)
   {
		sum=sum + Integer.parseInt(args[i]);
   }
   System.out.println("Sum ="+sum);
 }
}