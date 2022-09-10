#include<stdio.h>


int main()
{
	char ch;
	char s[255],sen[255];
	scanf("%c %s %[^\n]s", &ch, &s, sen);
	printf("%c\n%s\n%s", ch, s, sen);
	return 0;
}
