import java.io.*;
class array
{
	public static void main(String arg[])
	throws IOException
	{
		int a[][]=new int[4][];
		a[0]=new int[1];
		a[1]=new int[3];
		a[2]=new int[2];
		a[3]=new int[4];
		int i,j;
		
		DataInputStream in = new DataInputStream(System.in);
		for(i=0;i<4;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.println("Give matrix value:");
				a[i][j]=Integer.parseInt(in.readline());
			}
		}
		System.out.println();
		for(i=0;i<4;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
} 