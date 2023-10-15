#include <stdio.h>

int main() {
    // declare variables
    int num = 5;

    do { 
        // run everything inside {}
        printf("num is equal to %d\n", num);
        // reduce num by 1 same with 'num = num -1' or 'num -= 1'
        num--; 
    } while (num > 0); // check if num is greater than 0

    printf("loop finished");

    // exit program
    return 0;
}
