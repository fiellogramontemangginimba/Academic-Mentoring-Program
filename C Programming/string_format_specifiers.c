#include <stdio.h>

int main() {
    // declare variable
    char string[128];

    // get string
    printf("enter string: ");
    scanf("%s", &string);
    // display string
    printf("string entered: %s", string);

    // exit program
    return 0;
}
