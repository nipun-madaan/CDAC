#include<iostream>
using namespace std;
class Box{
    private:
        int length;
        int breadth;
        int height;
    public:
        Box(){
            length=0;
            breadth=0;
            height=0;
        }
        Box(int length,int breadth, int height){
            this->length=length;
            this->breadth=breadth;
            this->height=height;
        }
        friend void getHeight(Box b);
};
void getHeight(Box b){
    cout<<b.height;
}
int main(){
    Box b(10,20,30);
    getHeight(b);
}