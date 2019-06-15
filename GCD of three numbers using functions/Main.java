import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      System.out.println(gcdd(n1,n2));
	}
  public static int gcdd(int n1,int n2)
  {
  int min,gcd=1;
    if(n1<n2)
    {min=n1;}
    else{min=n2;}
    while(min>=1)
    {
    if((n1%min==0)&&(n2%min==0))
    {gcd=min;
    break;}
      min--;
    }
     return gcd;
  }
 
}