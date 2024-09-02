#include <iostream>
#include <stdio.h>

using namespace std;

class Rectangle
{
public:
    int length;
    int breadth;


int are(){
    return length*breadth;
}

int per(){
    return 2*(length+breadth);
}

int initialize( int l, int b){
    length = l;
    breadth = b;
}

};
int main(){

    // int length=0, breadth=0;//good practice
    Rectangle r;

    int l,b;
    printf("Enter the length and breadth : ");
    // cin >> r.length >> r.breadth ;
    cin >> l >> b;

    r.initialize(l,b);
    int area = r.are();
    int peri = r.per();

    printf("Area=%d\nPerimeter=%d\n",area, peri);

    return 0;
}