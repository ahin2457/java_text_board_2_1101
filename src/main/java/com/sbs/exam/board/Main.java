package com.sbs.exam.board;

public class Main {
  public static void main(String[] args) {
   String queryString = "a=1&b=2&c=3";
   String[] queryStringBits = queryString.split("&");

   int a = 0;
   int b = 0;
   int c = 0;

   for(String bit : queryStringBits){
     //System.out.println(bit);
     String[] bitBits = bit.split("=");
     String paramName = bitBits[0];
     String paramValue = bitBits[1];


     if(paramName.equals("a")){
       // 형변환 Integer.parseInt
       a = Integer.parseInt(paramValue);
     }
     else if(paramName.equals("b")){
       b = Integer.parseInt(paramValue);
     }
     else if(paramName.equals("c")){
       c = Integer.parseInt(paramValue);
     }
     System.out.printf("%s : %s\n",paramName,paramValue);
   }
    System.out.printf("a : %d\n", a);
    System.out.printf("b : %d\n", b);
    System.out.printf("c : %d\n", c);
  }
}