import java.util.Scanner;
class SumofIntegers 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println(" ");
		int N=in.nextInt();
		int K=in.nextInt();
		int sum=0;
		int a[]=new int[N];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<K;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(" ");
		System.out.println(sum);		
	}
}
