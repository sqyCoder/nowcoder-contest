#include<iostream>
using namespace std;
int main()
{
    int n=0,i=0;
    cin>>n;
    while(i<4)
    {
        if(i==0)
            cout<<n%10;
        else
        {
            n=n/10;
            cout<<n%10;
        }
        i++;
    }
    return 0;
}
