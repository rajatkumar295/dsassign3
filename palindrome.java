import java.util.*;
class Main
{
	int palin(String s)
	{
       String s2="";
       int i,l=s.length();
       for(i=l-1;i>=0;i--)
       {
         s2=s2+s.charAt(i);
       }
       if(s.equals(s2))
       {
       	return 1;
       }
       return 0;
	}
}
class palindrome
{
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		String s;
		s=x.nextLine();
		Main m=new Main();
		m.palin(s);
		if(m.palin(s)==1)
		{
			System.out.println(s+":is Palindrome");
		}
		else
		{
			System.out.println(s+":is not palindrome");
		}
	}
}