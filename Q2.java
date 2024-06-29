import java.util.*;
public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the email id ");
		String em= sc.next();
		boolean b= false;
		int c1=0;
		int c2=0;
		for(int i=0;i<em.length();i++) 
		{
			int a=(int)em.charAt(i);
			if((a>=97&& i<=122) || (a>=48&& a<=57)) 
			{
				b=true;
			}
			if(a==64) 
			{
				c1++;
			}
			if(a==46) 
			{
				c2++;
			}
		}
		if(b=true && c1==1 && c2==1) 
		{
			System.out.println("valid email");
		}
		else 
		{
			System.out.println("invalid email");
		}
	}

}
