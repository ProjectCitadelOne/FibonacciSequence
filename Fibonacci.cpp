// Output the first 100 numbers in the fibonacci sequence.

#include <iostream>

using namespace std;

int main() {
    // First numbers are 0 and 1.
    double a = 0, b = 1;
    cout << a << endl;
    cout << b << endl;
    // Compute and output the next 98 numbers in the sequence.
    for (int count = 0; count < 98; count += 1) {
        double sum = a + b;
        cout << fixed << sum << endl;
        a = b;
        b = sum;
    }
} // Find format to discard 0's after decimal point.
