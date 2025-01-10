// 2. How to add two numbers in C ?

#include <stdio.h>
int main()
{
    int num1, num2;
    printf("Enter first number:\n");
    scanf("%d", &num1);
    printf("Enter second number:\n");
    scanf("%d", &num2);
    int sum = num1 + num2;
    printf("Sum is %d.\n", sum);
    return 0;
}    
