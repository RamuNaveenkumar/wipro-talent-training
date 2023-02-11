
String frnt1="",mid1="",end1="";
  String frnt2="",mid2="",end2="";
  String frnt3="",mid3="",end3="";
  String output1="",output2="",output3="";
  int len1=input1.length();
  int len2=input2.length();
        int len3=input3.length();
  if(len1==input1.length()){
  if(len1%3==0)
  {
   frnt1=input1.substring(0, (len1/3));
   mid1=input1.substring((len1/3), (2*(len1/3)));
   end1=input1.substring(2*(len1/3));
  }
  else if((len1-1)%3==0)
  {
   frnt1=input1.substring(0, (len1/3));
   mid1=input1.substring((len1/3), ((2*(len1/3))+1));
   end1=input1.substring(((2*(len1/3))+1));
  }
  else if((len1-2)%3==0)
  {
   frnt1=input1.substring(0, ((len1/3)+1));
   mid1=input1.substring(((len1/3)+1), ((2*(len1/3))+1));
   end1=input1.substring(((2*(len1/3))+1));
  }
  }
   if(len2==input2.length()){
  if(len2%3==0)
  {
   frnt2=input2.substring(0, (len2/3));
   mid2=input2.substring((len2/3), (2*(len2/3)));
   end2=input2.substring(2*(len2/3));
  }
  else if((len2-1)%3==0)
  {
   frnt2=input2.substring(0, (len2/3));
   mid2=input2.substring((len2/3), ((2*(len2/3))+1));
   end2=input2.substring(((2*(len2/3))+1));
  }
  else if((len2-2)%3==0)
  {
   frnt2=input2.substring(0, ((len2/3)+1));
   mid2=input2.substring(((len2/3)+1), ((2*(len2/3))+1));
   end2=input2.substring(((2*(len2/3))+1));
  }
  }
   if(len3==input3.length()){
  if(len3%3==0)
  {
   frnt3=input3.substring(0, (len3/3));
   mid3=input3.substring((len3/3), (2*(len3/3)));
   end3=input3.substring(2*(len3/3));
  }
  else if((len3-1)%3==0)
  {
   frnt3=input3.substring(0, (len3/3));
   mid3=input3.substring((len3/3), ((2*(len3/3))+1));
   end3=input3.substring(((2*(len3/3))+1));
  }
  else if((len3-2)%3==0)
  {
   frnt3=input3.substring(0, ((len3/3)+1));
   mid3=input3.substring(((len3/3)+1), ((2*(len3/3))+1));
   end3=input3.substring(((2*(len3/3))+1));
  }
  }
  output1=frnt1+frnt2+frnt3;
  output2=mid1+mid2+mid3;
  output3=end1+end2+end3;
  System.out.println(output3);
  output3=changeCase(output3);
  Result rs=new Result(output1,output2,output3);
  return rs;
    }
 public static String changeCase(String str)
 {
  StringBuffer newS = new StringBuffer(str);
  for(int i=0;i<str.length();i++)
  {
   Character c=str.charAt(i);
   if(Character.isLowerCase(c))
   {
    newS.replace(i, i+1, Character.toUpperCase(c)+"");
   }
   else
   {
    newS.replace(i, i+1, Character.toLowerCase(c)+"");
   }
  }
  str=newS.toString();
  return str;
 }
