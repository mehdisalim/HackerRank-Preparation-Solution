#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>



int main() 
{
    int a, b;
    scanf("%d\n%d", &a, &b);
  	// Complete the code.
    int i = 0;
    char word[255][255] = {"null","one","two","three","four","five","six","seven","eight","nine"};
    while (a <= b)
    {
        if (a <= 9) {
            printf("%s\n",word[a]);
        }
        if (a > 9 && a % 2 == 0) {
            printf("even\n");
        }
        if (a > 9 && a % 2 != 0) {
            printf("odd\n");
        }
        a++;
    }
    return 0;
}

