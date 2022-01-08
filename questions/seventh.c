// 7. How to convert temperature from Fahrenheit to Celsius in C ?
                
#include <stdio.h>
int main()
{
    float temperatureInFahrenheit, temperatureInCelsius;
    printf("Enter the temperature in Fahrenheit:\n");
    scanf("%f", &temperatureInFahrenheit);
    temperatureInCelsius = (temperatureInFahrenheit - 32) / 1.8;
    printf("Temperature in Celsius: %.2f\n", temperatureInCelsius);
    return 0;
}    