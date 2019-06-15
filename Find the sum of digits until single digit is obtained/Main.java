#include<stdio.h>
int main()
{
int n,n2,n3,sum=0;
  scanf("%d",&n);
  while(n!=0)
  { int n1=n%10;
  n=n/10;
  sum=sum+n1;
  }

  if(sum>10)
  {
  n2=sum%10;
    n3=sum/10;
      printf("%d",n2+n3);
  }
  else
    printf("%d",sum);
return 0;
}