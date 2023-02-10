import java.io.*;
import  java.util.*;
class Most_Frequent_Digit
{
public int MostFrequentDigit(int input1, int input2, int input3, int input4){
int arr[]={input1,input2,input3,input4};
        int temp[]=new int[10];
        int num;
        for(int i=0;i<arr.length;i++)
        {   num=arr[i];
            while(num!=0)
            {
                int n=num%10;
                temp[n]++;
                num/=10;
            }
        }
        int max=-1;
        int x=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>=max)
            {
                max=temp[i];
                x=i;
            }
        }
    return x;
    }
}
