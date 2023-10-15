#include <stdio.h>

int main() {
    // declare variable
    int num1, num2;
    char operator;
    int answer = 0;

    // get user input
    printf("enter addition/subtraction equation: ");
    scanf("%d %c %d", &num1, &operator, &num2);

    if(operator == '+') { // check if operator is +
        // add numbers if operator is '+'
        answer = num1 + num2;
    } else if(operator == '-') { // check if operator is -
        // subtract numbers if operator is '-'
        answer = num1 - num2;
    } else { // check if operator is not supported
        // display error if operator not supported
        printf("error: %c not supported", operator);
        return 1;
    }

    // display answer
    printf("answer: %d %c %d = %d", num1, operator, num2, answer);

    // exit program
    return 0;
}
