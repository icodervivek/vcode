// 9. How to calculate the area of a circle ?
                
#include <stdio.h>
int main()
{
    float pie = 3.14;
    float radius;
    printf("Enter the radius of the circle:\n");
    scanf("%f", &radius);
    float areaOfCircle = (pie * radius * radius);
    printf("Area of the circle: %.2f\n", areaOfCircle);
    return 0;
} 