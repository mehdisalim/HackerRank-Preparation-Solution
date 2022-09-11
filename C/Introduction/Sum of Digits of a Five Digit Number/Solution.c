#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int ft_printnbr(int nbr)
{
    int res = 0;
    while (nbr != 0)
    {
        res +=nbr % 10;
        nbr /= 10; 
    }
    return res;
}

int main() {
	
    int n;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    printf("%d",ft_printnbr(n));
    return 0;
}
