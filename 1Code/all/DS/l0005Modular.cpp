#include <iostream>
#include <stdio.h>

using namespace std;

int are(int length, int breadth){
    return length* breadth;
}

int per(int length, int breadth){
    return 2*(length+breadth);
}

int main(){
    int length=0, breadth=0;//good practice

    printf("Enter the length and breadth : ");
    cin >> length >> breadth ;

    int area = are(length,breadth);
    int peri = per(length,breadth);

    printf("Area=%d\nPerimeter=%d\n",area, peri);

    return 0;
}