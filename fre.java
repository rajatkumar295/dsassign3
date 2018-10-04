import java.util.*;
class Main
{
	char max(String s)
	{
		int l=s.length();
		int i,j;
		char c;
		char[] ch=s.toCharArray();
		for(i=0;i<l-1;i++)
		{
          for(j=i+1;j<l;j++)
          {
          	if(ch[i]>ch[j])
          	{
             c=ch[i];
             ch[i]=ch[j];
             ch[j]=c;
            }
          }
		}
        return ch[l-1];
	}
}
class fre
{
	public static void main(String[] args)
	{
		Scanner x=new Scanner(System.in);
		String s;
		s=x.next();
        Main m=new Main();
        char r;
        r=m.max(s);
        System.out.println(r);
	}
}