// 10. Modify the same program of Q. 9 to calculate the volume of a cylinder.
                
#include <stdio.h>
int main()
{
    float pie = 3.14;
    float radius;
    printf("Enter the radius of the circle:\n");
    scanf("%f", &radius);
    float areaOfCircle = (pie * radius * radius);
    printf("Area of the circle: %.2f\n", areaOfCircle);
    float height;
    printf("Enter the height of the cylinder:\n");
    scanf("%f", &height);
    float volumeOfCylinder = (pie * radius * radius * height);
    printf("Volume of the cylinder: %.2f\n", volumeOfCylinder);
    return 0;
}             
