#include<stdio.h>

#include<string.h>

int countEvens(int input1,int input2,int input3,int input4,int input5)

{

// Read only region end

// Write code here

int cnt=0;

if(input1<0) input1=(-1)*input1;

if(input2<0) input2=(-1)*input2;

if(input3<0) input3=(-1)*input3;

if(input4<0) input4=(-1)*input4;

if(input5<0) input5=(-1)*input5;

if(input1%2==0) cnt++;

if(input2%2==0) cnt++;

if(input3%2==0) cnt++;

if(input4%2==0) cnt++;

if(input5%2==0) cnt++;

return cnt;

}
