//wap to find out power of a number.
#include<stdio.h>
#include<conio.h>

int main()
{
	int base ,exp,result=1;
	printf("Enter a base: ");
	scanf("%d",&base);
	printf("Enter a exponent: ");
	scanf("%d",&exp);
	
	while(exp!=0)
	{
		result=result*base;
		exp--;
	}
	printf("Result is: %d",result);
	return 0;
}