#include <iostream>
#include <stdio.h>

using namespace std;

int main(){
    int length=0, breadth=0;//good practice

    printf("Enter the length and breadth : ");
    cin >> length >> breadth ;

    int area = length* breadth;
    int peri = 2 * (length + breadth);

    printf("Area=%d\nPerimeter=%d\n",area, perimeter);

    return 0;
}