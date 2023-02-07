import java.io.*;
import  java.util.*;
class UserMainCode
{
 public int lastDigitOf(int input1){
     if(input1<0)
  {
   input1*=-1;
  }
  int n=input1%10;
  return n;
 }
}
