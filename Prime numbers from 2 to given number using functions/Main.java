import java.util.Scanner;
class Main
{
public static void main(String[] args)
{
  Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i=2;i<n;i++)
{
int p=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
p=1;
}
if(p==0){
System.out.println(i);
}
}
}
}
