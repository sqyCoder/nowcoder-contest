#include<iostream>
#include<algorithm>
using namespace std;
const int N=10010;
int arr[N];
int i=0,n=0;
int max_min(int arr[])
{
    int mx=arr[0],mn=arr[0];
    for(i=1;i<n;i++)
    {
    mx=max(mx,arr[i]);
    mn=min(mn,arr[i]);    
    }
    return (mx-mn);
}
int main()
{
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<max_min(arr)<<endl;
    return 0; 
}
