import java.util. *;
class intr
{
 public static void main(String arg[])
 {
     int sum = 0;
	 for(int i=0; i<arg.length; i++)
	 {
	   sum = sum + Integer.parseInt(arg[i]);
	 }
	 System.out.println("sum =" + sum);
 }
}