// 8. How to convert temperature from Celsius to Fahrenheit in C ?
                
#include <stdio.h>
int main()
{
    float temperatureInFahrenheit, temperatureInCelsius;
    printf("Enter the temperature in Celsius:\n");
    scanf("%f", &temperatureInCelsius);
    temperatureInFahrenheit = (temperatureInCelsius * 9/5) + 32;
    printf("Temperature in Fahrenheit: %.1f\n", temperatureInFahrenheit);
    return 0;
}  