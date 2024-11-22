package com.sbs.exam.board;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    //압축 된 데이터
    String queryString1 = "id=33&hitCount=1&age=14&studentNo=65&name=Bob";
                              // new Util이 아닌 이유 :  객체화 하지 않고 가져다가 쓰고 싶어서
    Map<String,String> params1 = Util.getParams(queryString1); // getParams - 우리의 요구사항을 받아서 요리를해서 주는 것
    System.out.println(params1);

    String queryString2 = "id=15&hitCount=100";
    Map<String,String> params2 = Util.getParams(queryString2);
    System.out.println(params2);

   // 압축 해제 시작 (데이터 파싱)


    }
  }

  class Util {
  // static : 객체화 하지 않고 getParams라는 메서드를 사용하려면 static 메서드가 되어야한다. / Map<Srting,String> : 타입 (Map 타입 리턴) / getParams(String queryStr) : (매개변수)
    static Map<String,String> getParams(String queryStr){
      Map<String,String> params = new HashMap<>();

      String[] queryStringBits1 = queryStr.split("&");

      for(String bit : queryStringBits1){
        String[] bitBits = bit.split("=");

        params.put(bitBits[0],bitBits[1]);
      }

      return params; // return을 하기로 약속했기 때문에 안 하면 오류남

    }
  }