#include <iostream>
#include <stdio.h>

using namespace std;

struct Rectangle
{
    int length;
    int breadth;
};

int are(struct Rectangle r){
    return r.length* r.breadth;
}

int per(struct Rectangle r){
    return 2*(r.length+r.breadth);
}

int initialize(struct Rectangle *r, int l, int b){
    r->length = l;
    r->breadth = b;
}
int main(){

    // int length=0, breadth=0;//good practice
    Rectangle r = {0,0};

    int l,b;
    printf("Enter the length and breadth : ");
    // cin >> r.length >> r.breadth ;
    cin >> l >> b;

    initialize(&r,l,b);
    int area = are(r);
    int peri = per(r);

    printf("Area=%d\nPerimeter=%d\n",area, peri);

    return 0;
}