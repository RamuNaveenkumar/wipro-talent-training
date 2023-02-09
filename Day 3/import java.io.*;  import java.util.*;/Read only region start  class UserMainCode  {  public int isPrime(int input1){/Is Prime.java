import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{

public int isPrime(int input1){

// Read only region end

int cnt=0;

for(int i=1;i<=input1;i++){

if(input1%i==0) cnt++;

}

if(cnt==2) return 2;

else return 1;

}

}
