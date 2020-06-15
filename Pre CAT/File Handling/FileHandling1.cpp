#include<iostream>
#include<fstream>
using namespace std;

int main(){
    ofstream fout;   //used for writing into files
    fout.open("Sample1.txt");
    string line;
    while(fout){
        getline(cin,line);
        if(line == "-1")
            break;
        fout<<line<<endl;
    }  
    fout.close();
    cout<<"Data entered successfully"<<endl;

    ifstream fin;  //used for reading from file
    fin.open("Sample1.txt");
    while(fin){
        getline(fin,line);
        cout<<line<<endl;
    }
    fin.close();
}