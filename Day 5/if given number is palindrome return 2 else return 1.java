int temp=input1;

int rev=0;

while(input1>0)

{

rev=rev*10+input1%10;

input1/=10;

}

if(rev!=temp)

return 1;

return 2;

}
