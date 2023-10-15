#include <stdio.h>

int main() {
    // declare variables
    int num = 4;

    if(num == 5) { // check if num is equal to 5
        // run everything inside {} if num is equal to 5
        printf("num is equal to 5");
    } else if(num == 4){
        // run everything inside {} if num is equal to 4
        printf("num is not equal to 5 but equal to 4");
    } else {
        // run everything inside {} if 'if' expression is false
        printf("num is not equal to 5 nor 4");
    }

    // exit program
    return 0;
}
