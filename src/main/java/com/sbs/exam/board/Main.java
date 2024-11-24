package com.sbs.exam.board;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    //압축 된 데이터
    Map<String,String> params = Utill.getParams("id=33&hitCount=1&name=BOb&calc=[1=2]"); // getParams - 우리의 요구사항을 받아서 요리를해서 주는 것
    System.out.println(params);
    System.out.println(params.get("id")); // 33
    System.out.println(params.get("name")); // Bob
    System.out.println(params.get("calc"));
    }
  }

  // void -> return 안하겠다.
  class Utill{
  static Map<String,String> getParams(String queryStr){
    Map<String,String> params = new HashMap<>();

    for(String bit :  queryStr.split("&")){
     String[] bits = bit.split("=",2);// 나누는 것을 최대 2개까지 나누겠단ㅋ

     if(bits.length == 1){
      continue;
     }
     params.put(bits[0],bits[1]);
    }
      return params;
    }
  }
//  class Utill {
//  // static : 객체화 하지 않고 getParams라는 메서드를 사용하려면 static 메서드가 되어야한다. / Map<Srting,String> : 타입 (Map 타입 리턴) / getParams(String queryStr) : (매개변수)
//    static Map<String,String> getParams(String queryStr){
//      Map<String,String> params = new HashMap<>();
//
//      String[] queryStringBits1 = queryStr.split("&");
//
//      for(String bit : queryStringBits1){
//        String[] bitBits = bit.split("=");
//
//        params.put(bitBits[0],bitBits[1]);
//      }
//
//      return params; // return을 하기로 약속했기 때문에 안 하면 오류남
//
//    }
//  }