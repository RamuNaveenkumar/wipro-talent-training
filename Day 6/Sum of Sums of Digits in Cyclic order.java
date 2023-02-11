import java.io.*;

import  java.util.*;

class UserMainCode{

public int sumOfSumsOfDigits(int input1){             

String str=Integer.toString(input1); 

int sum=0; 
for(int i=0;i<str.length();i++)  {   
 for(int j=i;j<str.length();j++){   

int num=Character.getNumericValue(str.charAt(j));   

sum+=num;  
}} 

  return sum; 

}}
