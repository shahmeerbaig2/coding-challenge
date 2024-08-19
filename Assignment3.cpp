#include <iostream>
using namespace std;

// Function to find the maximum element in the array
int Max(int *arr, int size) {
    int max = *arr;
    for (int i = 1; i < size; i++) {
        if (*(arr + i) > max) {
            max = *(arr + i);
        }
    }
    return max;
}

// Function to reverse the elements of the array
void reverseArray(int *arr, int size) {
    for (int i = 0; i < size / 2; i++) {
        swap(*(arr + i), *(arr + size - i - 1));
    }
}

// Function to swap the first and last elements of the array
void swapFirstLast(int *arr, int size) {
    swap(*arr, *(arr + size - 1));
}

int main() {
    //taking size as input from user
    int size;
    cout << "Enter the size of the array : ";
    cin >> size;

    int arr[size];
    cout << "Enter " << size << " elements of the array: ";
    for (int i = 0; i < size; i++) {
        cin >> arr[i];
    }

    // Printing the array
    cout << "5 elements of array are: ";
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    // Find maximum element and print
    cout << "Maximum element in the array: " << Max(arr, size) << endl;

    // Reverse the array 
    reverseArray(arr, size);
    cout << "Array after reversing: ";
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    // Swap first and last elements and print
    swapFirstLast(arr, size);
    cout << "Array after swapping first and last elements: ";
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
