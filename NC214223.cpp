#include <iostream>
using namespace std;
int main() {
    long long m, n;
    cin >> m >> n;
    if (m % n == 0) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
    return 0;
}
