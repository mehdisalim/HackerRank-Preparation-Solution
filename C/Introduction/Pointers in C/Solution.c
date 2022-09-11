#include <stdio.h>

void update(int *a,int *b) {
    // Complete this function
    int _a,_b;
    _a = *a;
    _b = *b;
    *a = _a + _b;
    if ((_a - _b) < 0)
        *b = -(_a - _b);
    else
       *b =_a - _b; 
}
int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}

