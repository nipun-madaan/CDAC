// CPP program to illustrate 
// Run Time Type Identification 
#include<iostream> 
using namespace std; 
class B {  }; 
class D: public B { }; 

int main() 
{ 
	B *b = new D; 
	D *d = (D*)(b); 
	if(d != NULL) 
		cout << "works"; 
	else
		cout << "cannot cast B* to D*"; 
	getchar(); 
	return 0; 
} 
