#include<iostream>
using namespace std;
const int N=30;
int arr[N];
int main()
{
    int n=0,i=0,m=0,flag=0;
    while(cin>>n)
    {
        for(i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        cin>>m;
        for(i=0;i<n;i++)
        {
            if(arr[i]==m)
            {
                flag++;
                cout<<i;
            break;
            }
        }
        if(flag==0)
                cout<<"No";
    }
    return 0;
}
