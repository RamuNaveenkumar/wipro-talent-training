{

int h1[26]={0};

int i;

while(input1>0)

{

h1[input1%10]++;

input1/=10;

}

int odd=0;

for(i=0;i<10;i++)

{

if(h1[i]&1)

odd++;

if(odd>1)

return 1;

}

return 2;

}
