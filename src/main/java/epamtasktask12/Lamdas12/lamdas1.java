package epamtasktask12.Lamdas12;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.IntStream;
class Nlist
{
    public List<String> list;
	Nlist(List<String> list)
	{
		this.list = list;
	}
    public List<String> lists(List<String> list,int n)
    {
        List<String> palindrome=new ArrayList<String>();
        int i=0;
        while(i<n)
        {
            String s = list.get(i).replaceAll("\\s+", "").toLowerCase();
            if(IntStream.range(0, s.length() / 2).noneMatch(j -> s.charAt(j) != s.charAt(s.length() - j - 1))==true)
            {
                palindrome.add(s);
            }
            i++;
        }
        return palindrome;
    }
}
public class lamdas1
{
    public static void main(String args[])
    {
        List<String> li=new ArrayList<String>();
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        for(int i=1;i<=n;i++)
        {
            String str=s1.next();
            li.add(str);
        }
        Nlist l=new Nlist(li);
        List<String> f=l.lists(li,n);
        System.out.print(f);
    }
}
