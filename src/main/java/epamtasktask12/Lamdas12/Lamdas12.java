package epamtasktask12.Lamdas12;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
class Avg
{
    public List<Integer> list;
	Avg(List<Integer> list)
	{
		this.list = list;
	}
    public void s(List<Integer> list,int n)
    {
        int s=list.stream().mapToInt(i -> i).sum();
        System.out.print(s/n);
    }
}
public class Lamdas12
{
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<Integer>(); 
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            int m=s.nextInt();
            list.add(m);
        }
        Avg a=new Avg(list);
        a.s(list,n);
    }
}