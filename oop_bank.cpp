#include <iostream>
using namespace std;


class Bank{
	private:
		int balance = 1500;
		int withdraw ;
		int deposit ;
	public:
		int Barcelona = true;
		int choice;

		void menu(){
			cout << "1. check account " <<endl;
			cout << "2. withdraw cash " <<endl;
			cout << "3. Deposit cash " <<endl;
	 	    cout << "4. Quit " <<endl;
			cout << "chose from the menu : " <<endl;
			cin >> choice;
		}

		void case1(){
			cout << "your current balance is : $ " <<balance << endl;
		}

		void case2(){
				cout << "Enter the amount to withdraw : " << endl;
	 	 		cin >> withdraw;
	 	 		if ( withdraw > balance){
	 	 			cout <<" you don't have enough money ........... " ;
				  }
	 	 		else{
	 	 			balance = balance - withdraw;
	 	 		cout << "your current balance is : $ " <<balance << endl;
				  }
			}

		void case3(){
				cout << " Enter the amount to deposit : " ; 
	 	 		cin >> deposit;
	 	 		balance = balance +deposit ;
	 	 		cout << "your current balance is : $ " <<balance << endl;
			}


};

// ******************************************************************************************************

int main() {

	Bank ban;
	int pin;
	cout << "\n\n ************************* welcome to the Bank masr ************************** \n\n" ;
	while (pin != 2468)
	{
		cout << "Enter your pin : "	<< endl;
	cin >> pin ;
		if( pin !=2468 ){
			cout << "please Enter a correct  pin : " << endl;
	cin >> pin;	}
	}
	 
	 do {
		 	ban.menu();
	 	 	switch (ban.choice){
	 	 	case 1 :
	 	 		  ban.case1();
	 	 		  break;
	 	 	case 2 :	
	 	 			ban.case2();
				  	break;
			case 3:
				  ban.case3();
	 	 		  break; 
	        case 4:
	        	cout << " \n****************** Thank you for using Bank masr ******************\n" ;
	 	 		 ban.Barcelona = false ;  
					break;
	 	 	default:
			    cout << " the number does not exist ....................." ;	  
				  break; 		  
			  }
	 }
	 while(ban.Barcelona != false);
	return 0;
}
