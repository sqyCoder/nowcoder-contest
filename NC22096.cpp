#include<iostream>
using namespace std;
int main()
{
    int a=0,i=0,j=0;
    while(cin>>a)
    {
        for(i=0;i<a;i++)
        {
            for(j=1;j<=i+1;j++)
            {
                cout<<j<<" ";
            }
            cout<<endl;
        }
    }
    return 0;
}
