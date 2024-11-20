package com.sbs.exam.board;

public class Main {
  public static void main(String[] args) {
   String queryString = "a=10&b=20&c=30&d=40";
   String[] queryStringBits = queryString.split("&");

    // 문제점 : 로직 자체 유연하지 못한다.
    // 왜? : 파라미터가 추가되면 그거에 맞는 로직을 다시 수정해줘야 하기 때문에

   int a = 0;
   int b = 0;
   int c = 0;
   int d = 0;

   for(String bit : queryStringBits){
     //System.out.println(bit);
     String[] bitBits = bit.split("=");
     String paramName = bitBits[0];
     String paramValue = bitBits[1];


     if(paramName.equals("a")){
       // 문자열을 정수로 변환해줌. 형변환 Integer.parseInt
       // 일반 int는 일반 타입 integer.parseInt는 객체 타입 그리고 null을 허용 (문자열인 String도 null을 허용)
       a = Integer.parseInt(paramValue);
     }
     else if(paramName.equals("b")){
       b = Integer.parseInt(paramValue);
     }
     else if(paramName.equals("c")){
       c = Integer.parseInt(paramValue);
     }
     else if(paramName.equals("d")){
       d = Integer.parseInt(paramValue);
     }
   //  System.out.printf("%s : %s\n",paramName,paramValue);
   }
    System.out.printf("a : %d\n", a);
    System.out.printf("b : %d\n", b);
    System.out.printf("c : %d\n", c);
    System.out.printf("d : %d\n", d);
  }
}