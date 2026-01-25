#include<iostream>
using namespace std;
int main()
{
    long long a=0,b=0;
    cin>>a>>b;
    long long c=(b%a==0 ? a+b : b-a);
    cout<<c<<endl;
    return 0;
}
