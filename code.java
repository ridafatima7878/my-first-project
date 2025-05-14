//Write a function that receive one integer number as an argument from main().
// The function display a message on screen, the passing number is prime or not.

#include <iostream>
using namespace std;

// Function to check if a number is prime
void checkPrime(int num) {
    bool isPrime = true;

    if (num <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    if (isPrime) {
        cout << num << " is a prime number." << endl;
    } else {
        cout << num << " is not a prime number." << endl;
    }
}

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    checkPrime(num);
    return 0;
}
