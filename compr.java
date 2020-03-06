import java.lang. *;
class Compare
{
 public static void main(String arg[])
 {
  int x,y,z=8;
  x=6;
  y=4;
  System.out.println("first no. =" +x);
  System.out.println("second no. =" +y);
  System.out.println("third no. =" +z);
	if(x>y & x>z)
	{
		System.out.println("greatest no. =" +x);
	}
	else if(y>z )
	{
		System.out.println("greatest no. =" +y);
	}
	else 
	{
		System.out.println("greatest no. =" +z);
	}
 }
}