#include <stdio.h>

int main() {
    // declare variable
    int num1, num2;
    char operator;

    // get user input
    scanf("%d %c %d", &num1, &operator, &num2);

    // display user input
    printf("equation entered: %d %c %d", num1, operator, num2);

    // exit program
    return 0;
}
