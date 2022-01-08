// 3. How to subtract two numbers in C ?
                
#include <stdio.h>
int main()
{
    int num1, num2;
    printf("Enter first number:\n");
    scanf("%d", &num1);
    printf("Enter second number:\n");
    scanf("%d", &num2);
    int difference = num1 - num2;
    printf("Difference is %d.\n", difference);
    return 0;
}               
