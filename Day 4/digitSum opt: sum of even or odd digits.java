import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public int EvenOddDigitsSum(int input1,String input2){

// Read only region end

// Write code here...

if(input2.equals("odd"))

{

int sum=0;

while(input1>0)

{

int r=input1%10;

if(r%2==1)

{

sum+=r;

}

input1/=10;

}

return sum;

}

else

{

int sum=0;

while(input1>0)

{

int r=input1%10;

if(r%2==0)

{

sum+=r;

}

input1/=10;

}

return sum;

}

}

}
