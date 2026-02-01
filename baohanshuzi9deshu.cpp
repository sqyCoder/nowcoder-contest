#include<iostream>
using namespace std;

int main()
{
    int count = 0;
    for (int i = 1; i <= 2019; i++)
    {
        int ge = i % 10; 
        int shi = (i / 10) % 10;  
        int bai = (i / 100) % 10; 
        int qian = (i / 1000) % 10; 
        if (ge == 9 || shi == 9 || bai == 9 || qian == 9)
        {
            count++;
        }
    }
    cout << count << endl;
    return 0;
}
