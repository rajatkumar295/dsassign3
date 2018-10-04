import java.util.*;
class subseq
{
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		String s="abc";
		int i=0,j;
		while(i<s.length())
		{
          System.out.println(s.charAt(i));
          i++;
		}
		for(i=0;i<s.length();i++)
		{
			for(j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)!=s.charAt(j))
				{
				System.out.print(s.charAt(i));
				System.out.println(s.charAt(j));
			    }
			}
		}
		System.out.println(s.substring(0,s.length()));
	}
}