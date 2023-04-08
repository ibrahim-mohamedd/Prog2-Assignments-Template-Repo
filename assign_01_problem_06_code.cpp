// ibrahim mohamed abbass  ID:20216490
#include <iostream>

using namespace std;

int main()
{
    long long n;
    cin>>n;
    while(n>=10){
        n/=10;
    }
    if(n % 2==0)
        cout<<"EVEN"; 
        else
        cout<<"ODD";
    return 0;
}
