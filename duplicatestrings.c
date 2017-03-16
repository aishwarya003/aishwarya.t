
#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
char a[100];
int i=0,k=0,j;

scanf("%s",a);
j=strlen(a);
while(k<j)
{
if(a[i]==a[i+1])
i++;
else
a[k]=a[i];
i++;
k++;
}
for(i=0;i<k;i++)
{
printf("%c",a[i]);
}

}
