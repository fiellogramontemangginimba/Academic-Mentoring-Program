#include <stdio.h>

int main() {
    // declare variables
    int num = 4;

    switch(num) {
        case 5:
            // run everything inside {} if num is equal to 5
            printf("num is equal to 5");
            break;
        case 4:
            // run everything inside {} if num is equal to 4
            printf("num is equal to 4");
            break;
        default:
            // run everything inside {} if num is did not match above
            printf("num is not equal to 5 nor 4");
            break;
    }

    // exit program
    return 0;
}
