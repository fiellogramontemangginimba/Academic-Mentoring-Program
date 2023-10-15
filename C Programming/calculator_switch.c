#include <stdio.h>

int main() {
    // declare variable
    int num1, num2;
    char operator;
    float answer = 0;

    // get user input
    printf("enter equation: ");
    scanf("%d %c %d", &num1, &operator, &num2);

    switch(operator) {
        case '+': // check if operator is +
            answer = num1 + num2;
            break;
        case '-': // check if operator is -
            answer = num1 - num2;
            break;
        case '*': // check if operator is *
            answer = num1 * num2;
            break;
        case '/': // check if operator is /
            answer = (float) num1 / num2; // convert result to float
            break;
        default: // not supported
            printf("error: %c not supported", operator);
            return 1; // break not needed if has return statement
    }

    // display answer
    printf("answer: %d %c %d = %f", num1, operator, num2, answer);

    // exit program
    return 0;
}
