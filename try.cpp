#include <iostream>
#include <iomanip>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
class Time
	{
	private:
		int hour;
		int minute;
		int second;
		
	public: 
		Time(int h, int m, int s)
		{
			hour=h;
			minute=m;
			second=s;
		}
		void print()
		{
	/*	cout <<	setfill('0');*/
			cout << "  "<< hour <<":" << setw(2) <<minute <<":" << setw(2) <<second <<endl;
		}
	};
int main()
{
Time t(1,1,30);
t.print();

}
