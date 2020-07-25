package epamtasktask12.Lamdas12;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;
class Nelist
{
    public List<String> t;
	Nelist(List<String> t)
	{
		this.t = t;
	}
    public List<String> lists(List<String> list,int n)
    {
        List<String> c = list.stream() .filter(x -> x.length()==3) .collect(Collectors.toList());
        List<String> k = c.stream().filter( s -> s.startsWith("a") ).collect(Collectors.toList());
        return k;
    }
}
public class lamdas2
{
    public static void main(String args[])
    {
        List<String> list=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            String s=sc.next();
            list.add(s);
        }
        Nelist l=new Nelist(list);
        List<String> f=l.lists(list,n);
        System.out.print(f);
    }
}