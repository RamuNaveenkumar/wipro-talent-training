import java.io.*;
import java.util.*;
class UserMainCode
{
public int addNumberString(String input1,String input2)
{
int carry=0;
  if(input1.length()<input2.length())
  {
    String temp="";
   temp=input1;
   input1=input2;
   input2=temp;
  }
  int len1=input1.length();
  int len2=input2.length();
  String str="";
  int j=len2-1;
  for(int i=0;i<len1;i++)
  {
   int a=Character.getNumericValue(input1.charAt(len1-1-i));
   int b=0;
   if(j>=0)
   {
    b=Character.getNumericValue(input2.charAt(j));
    j--;
   }
   int sum=a+b+carry;
   carry=sum/10;
   int init=sum%10;
   str=Integer.toString(init)+str;
   if(i==len1-1 && carry>0)
   {
              str=Integer.toString(carry)+str;
    }
  }
  return str;
 }
}
