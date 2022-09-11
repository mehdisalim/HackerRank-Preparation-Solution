#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  //Write your code here.
  int andResult = 0;
  int orResult = 0;
  int notOrResult = 0;
  for (int i = 1; i < n; i++) {
      for (int j = i + 1 ; j <= n; j++) {
            if ((i & j) > andResult && (i & j) < k) andResult = i & j;
            if ((i | j) > orResult && (i | j) < k)  orResult = i | j;
            if ((i ^ j) > notOrResult && (i ^ j) < k)   notOrResult = i ^ j;
      }
  }
  printf("%d\n%d\n%d", andResult, orResult, notOrResult);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}

