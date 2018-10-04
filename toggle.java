import java.util.*;
class Main
{
	String tog(String s)
	{
		String s2="";
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			String s3="";
			if((int)s.charAt(i)<90)
			{
				
				s3=s3+s.charAt(i);
				s2=s2+s3.toLowerCase();
			}
			else
			{
			    s3=s3+s.charAt(i);
				s2=s2+s3.toUpperCase();
			}
		}
		return s2;
	}
}
class toggle
{
	public static void main(String[] args)
	{
	Scanner x=new Scanner(System.in);
    String s,t;
    s=x.next();
	Main m=new Main();
	t=m.tog(s);
	System.out.print(t);
	}
}