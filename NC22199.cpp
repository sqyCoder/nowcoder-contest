#include<iostream>
using namespace std;
int main()
{
    long long n=0,i=0,sum=0;
    cin>>n;
    while(n)
    {
        sum=sum+n%10;
         n=n/10;
        i++;
    }
    cout<<sum<<endl;
    return 0;
}
