#include <stdio.h>

int main() {
    int firstNumber;
    int secondNumber;
    printf("Enter the first number of your choice: ");
    scanf("%d", &firstNumber);
    printf("Enter the second number of your choice: ");
    scanf("%d", &secondNumber);
    int result = firstNumber + secondNumber;

    

    printf("The result is %d\n", result);

    return 0;
}
