import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int secondLastDigitOf(int input1){
  if(input1>=-9 && input1<=9)
   return -1;
   if(input1<0)
   input1*=-1;
  input1/=10;
  int n=input1%10;
  return n;
 }
}
