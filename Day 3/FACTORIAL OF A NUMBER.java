import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public long nthFibonacci(int input1){

// Read only region end

int a=0;

int b=1;

int c=0;

int d=3;

while(d<=input1){

c=a+b;

a=b;

b=c;

d++;

}

return c;

}

}
