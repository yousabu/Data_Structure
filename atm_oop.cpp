#include <iostream>
using namespace std;

class Atm{
    private:
        int balance = 1000 ;
    public:
        int correct = true ;
        int choice ;
        int withdraw ;
        int deposit ;
    void menu(){
         cout <<"1. check account" << endl;
            cout <<"2. withdraw cach" << endl;
            cout <<"3. deposit cash" << endl;
            cout <<"4. quit" << endl;
                cout <<"chose from menu : " ;
                cin >> choice;
    }
    void case1(){
        cout <<"your current balance is : $" << balance << endl;
      
    }
    void case2(){
        cout <<"enter the amount to withdraw : ";
        cin >> withdraw ;

        if (withdraw > balance){
            cout << "don't have enough money.....";
        } else{
        balance = balance - withdraw;
        cout <<"your current balance is : $" << balance << endl;
        }
    }
    void case3(){
        cout <<"enter the amount to deposit : " ;
        cin >> deposit ;
        balance = balance + deposit ;
        cout <<"your current balance is : $" << balance << endl;
    }



};

int main()
{
   int pin ;
   Atm at;

while (pin !=1234){
cout <<"enter your pin : " ;
cin >> pin ;
}
do{ 
    at.menu();

    switch (at.choice){
case 1 :
    at.case1();
    break;
case 2 :
     at.case2();
     break;
case 3 :
    at.case3();
    break ;
case 4 :
    cout << "\n************** thank you ***************\n";
    at.correct = false ;
    break ;
default :
    cout << "the number dose not exist ........" ;
    break;
    }

   }while(at.correct != false);

}