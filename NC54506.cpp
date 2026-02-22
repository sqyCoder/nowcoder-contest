#include<iostream>
#include<cstring>
using namespace std;
int main()
{
    long long a=0;
    cin>>a;
    string s=to_string(a);
        for(char &e:s)
        {
            if((e-'0')%2==0)
                e='0';
            else 
                e='1';
        }
    cout<<stol(s)<<endl;
    return 0; 
}
