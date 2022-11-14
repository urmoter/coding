#include <stdio.h>

int main() {
    int max;
    printf("Maximum: ");
    scanf("%d", &max);
    int min = 0;
    int arr[max];
    while(min < max) {
        arr[min] = min+1;
        min++;
    }
    int loop;
    for(loop = 0; loop < max; loop++) {
        printf("%d\n", arr[loop]);
    }

    return 0;
}