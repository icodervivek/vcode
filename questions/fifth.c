// 5. How to divide two numbers in C ?
                
#include <stdio.h>
int main()
{
    int num1, num2;
    printf("Enter first number:\n");
    scanf("%d", &num1);
    printf("Enter second number:\n");
    scanf("%d", &num2);
    int division = num1 / num2;
    printf("Result is %d.\n", division);
    return 0;
}