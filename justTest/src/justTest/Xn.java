package justTest;

public class  Xn {
	int sum;
	Xn(int n) {
		
		for (int i=1;i<=n;i++)
		{
			sum=sum+i;
		}	
	}
	public void sum() {
		System.out.println("1~n의 합 =" + sum);
	}
}
