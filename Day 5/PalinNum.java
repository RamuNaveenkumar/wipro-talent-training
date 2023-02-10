import java.io.*;
import  java.util.*;
class is_Palin_Num
{
public int isPalinNum(int input1){
String str=Integer.toString(input1);
        int len=str.length();
        String str1="";
        for(int i=len-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        if(str.equals(str1))
        return 2;
        else
        return 1;
    }
}
