#include <iostream>
using namespace std;
int main() {
    int n;    
    cin >> n;
    int month = n % 100;
    switch (month) {
        case 3:
        case 4:
        case 5:
            cout << "spring" << endl;
            break;
        case 6:
        case 7:
        case 8:
            cout << "summer" << endl;
            break; 
        case 9:
        case 10:
        case 11:
            cout << "autumn" << endl;
            break;
        case 1:
        case 2:
        case 12:
            cout << "winter" << endl;
            break;
        default:
            break;
    }
    
    return 0;
}
