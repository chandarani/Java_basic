import java.io.*;
class cal
{
 public static void main(String args[])
 {
   int a=12,b=6,ch=1;
	
	System.out.println("1. Addition ");
   System.out.println("2. subtraction ");
   System.out.println("3. multiplication ");
   System.out.println("4. division ");
	switch(ch)
	{
   case 1:System.out.println("summation of number is:-  "+(a+b));
   break;
   case 2: System.out.println("subtraction of number is:-  "+(a-b)); break;
   case 3: System.out.println("multiplication of number is:-  "+(a*b));break;
   case 4: System.out.println("division of number is:-  "+(a/b)); 
  //efault:exit();
   }
 }
}