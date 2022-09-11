#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int s,d;
    float   i,j;
    
    scanf("%d %d", &s, &d);
    scanf("%f %f", &i, &j);
    
    printf("%d %d \n%0.1f %0.1f", (s+d),(s-d),(i+j),(i-j));
    
    return 0;
}

