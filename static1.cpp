#include<iostream>
using namespace std;
class Demo
{
    public:
    int no1,no2;
    static int x;
    Demo()
    {
        this->no1=10;
        this->no2=20;
    }
    void fun()
    {
        cout<<"inside fun\n";
        cout<<this->no1<<"\n";
        cout<<x<<"\n";
         }
         static void gun()
        
        {
            cout<<"inside gun\n";
            cout<<x<<"\n";
        }
};

int Demo::x=11;
int main()
{
cout<<"value of x is :"<<Demo::x<<"\n";
Demo::gun();
Demo obj1;
Demo obj2;
cout<<"size of object is:"<<sizeof(obj1)<<"\n";
cout<<obj1.no1<<"\t"<<obj1.no2<<"\n";
cout<<obj2.no1<<"\t"<<obj2.no2<<"\n";
obj1.fun();
obj2.fun();
obj1.gun();
cout<<"value of x using object is:"<<obj1.x<<"\n";
    return 0;
}
