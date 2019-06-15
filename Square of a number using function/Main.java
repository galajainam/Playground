import java.util.Scanner;
class Main
{public static int square(int n)
 {
  int m=n*n;
   return m;
 }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int m1=square(n1);
      System.out.println(m1);
	} 
}
