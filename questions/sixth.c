// 6. How to find modulos of two numbers in C ?
                
#include <stdio.h>
int main()
{
    int num1, num2;
    printf("Enter first number:\n");
    scanf("%d", &num1);
    printf("Enter second number:\n");
    scanf("%d", &num2);
    int modulos = num1 % num2;
    printf("Result is %d.\n", modulos);
    return 0;
}               
