#include<stdio.h>
#include<conio.h>

void main()
{
	printf("Enter any number: ");
	scanf("%d", & input);
	
	for(int i=1;i<=10;i++)
	printf("%d*%d=%d",input,i,input*i);
	getch();
}