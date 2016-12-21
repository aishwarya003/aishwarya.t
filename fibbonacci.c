#include<stdio.h>
#include<conio.h>
int main()
{
 int fib,x,y=0,z=1;
 printf("\n%d\n%d",y,z);
 fibb(y,z);
}
 fibb(int a,int b)
 {
  int n=1,c=0;
  while(n<10)
  {
  a=b;
  c=b+c;
  printf("\n%d",c);
  b=c;
  c=a;
  n++;
  }
  return 0;
  }

