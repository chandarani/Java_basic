import java.lang. *;
class leap
{
	public static void main(String args[])
	{
		int yr = 400;
		if(yr%4 == 0 && yr%100 != 0)  
		{
		  System.out.println(yr + "is leap year");
        }
        else if( yr%400 == 0)
		{
		System.out.println(yr + "is leap year");
		}
		else
		{
        System.out.println("Not leap year"); 
        }  		
	}
}