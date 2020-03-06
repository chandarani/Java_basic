import java.io.*;
class vol
{
 public static void main(String args[])
 {
   //ar ch='A'
	int ch=1;
	
	switch(ch)
	{
   case 'a':
   case 'e':
   case 'i':
   case 'o':
   case 'u':
   case 'A':
   case 'E':
   case 'U':
   case 'O':
   case 'I': System.out.println(ch+" is a vowel");
			break;
	case 1:
	case 2:System.out.println(ch+" is a number");
			break;
    default:System.out.println(ch+" is a consonant");
			
   }
 }
}