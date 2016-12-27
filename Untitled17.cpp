#include <iostream>
using namespace std;

int main(void) {

	char ch[100];
	int arr[100],i,c=0;
	cin>>ch;
	for(i=0;ch[i]!='\0';i++)
	{
	  arr[i]=ch[i];
	  c+=arr[i];
	}
	cout<<c/i;
	return 0;
}
