#include<iostream>
#include<string>
using namespace std;
int main()
{
    string s;
    int i=0,Letters=0,Digits=0,Others=0;
    getline(cin,s);
    int sz=s.size();
    for(i=0;i<sz-1;i++)
    {
        if(s[i]>=48 && s[i]<=57)
            Digits++;
        else if((s[i]>=65 && s[i]<=90) || (s[i]>=97 && s[i]<=122))
                Letters++;
        else
            Others++;
    }
    cout<<"Letters="<<Letters<<endl<<"Digits="<<Digits<<endl<<"Others="<<Others<<endl;
    return 0;
}
