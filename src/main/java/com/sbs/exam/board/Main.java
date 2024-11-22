package com.sbs.exam.board;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    //압축 된 데이터
    String queryString1 = "id=33&hitCount=1&age=14&studentNo=65&name=Bob";

   // 압축 해제 시작 (데이터 파싱)
   String[] queryStringBits1 = queryString1.split("&");

   Map<String,String> params1 = new HashMap<>(); // 순서를 보장x
    //Map<String,String> params = new LinkedHashMap<>(); // 순서를 보장o

    for(String bit : queryStringBits1){
     String[] bitBits = bit.split("=");

     params1.put(bitBits[0],bitBits[1]);
   }
   // 압축 해제 끝
    System.out.println(params1);


    //압축 된 데이터
    String queryString2 = "id=33&hitCount=1";

    // 압축 해제 시작 (데이터 파싱)
    String[] queryStringBits2 = queryString2.split("&");

    Map<String,String> params2 = new HashMap<>(); // 순서를 보장x
    //Map<String,String> params = new LinkedHashMap<>(); // 순서를 보장o

    for(String bit : queryStringBits1){
      String[] bitBits = bit.split("=");

      params2.put(bitBits[0],bitBits[1]);
    }
    // 압축 해제 끝


    System.out.println(params2);
    }
  }