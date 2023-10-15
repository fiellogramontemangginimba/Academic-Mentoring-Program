#include <stdio.h>

int main() {
    // declare variables
    int num = 5;

    while (num > 0) { // check if num is greater than 0
        // run everything inside {} if num is greater than 0
        printf("num is equal to %d\n", num);
        // reduce num by 1 same with 'num = num -1' or 'num -= 1'
        num--; 
    }

    printf("loop finished");

    // exit program
    return 0;
}
