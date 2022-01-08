// 4. How to multiply two numbers in C ?
                
#include <stdio.h>
int main()
{
    int num1, num2;
    printf("Enter first number:\n");
    scanf("%d", &num1);
    printf("Enter second number:\n");
    scanf("%d", &num2);
    int multiply = num1 * num2;
    printf("Product is %d.\n", multiply);
    return 0;
}  