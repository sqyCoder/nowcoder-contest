#include<iostream>
using namespace std;

int main()
{
int i=0,j=0,count=0;
for(i=1;i<=2019;i++)
{
    int m=i;
    while(m!=0)
    {
        if(m%10==9)
        {
        count++;
        break;
        }
        m=m/10;
    }
}
cout<<count<<endl;
    return 0;
}
