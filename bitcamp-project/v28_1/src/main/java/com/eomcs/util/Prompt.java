package com.eomcs.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {
  
  Scanner input;
  
  public Prompt(Scanner input) {
    this.input = input;
  }

  
  public String inputString(String label) {
    System.out.print(label);
    return input.nextLine();
  }

  public String inputString(String label, String defaultValue) { //오버로딩
    System.out.print(label);
    String value = input.nextLine();
    if (value.length() == 0) {
      return defaultValue;
    }
    return value;
  }

  public int inputInt(String label) {
    System.out.print(label);
    return Integer.parseInt(input.nextLine()); //입력받은 걸 숫자로 티런
  }


  public int inputInt(String label, int defaultValue) {
    System.out.print(label);
    String value = input.nextLine();
    if (value.length() == 0) {
      return defaultValue; // 디폴트값은 사용자가 빈문자열 입력할 때 쓰는 변수
    }
    return Integer.parseInt(value);
  }

  public Date inputDate(String label) {
    System.out.print(label);
    return Date.valueOf(input.nextLine()); // 입력받은걸 날짜로 리턴
  }

  public Date inputDate(String label, Date defaultValue) {
    System.out.print(label);
    String value = input.nextLine();
    if (value.length() == 0) {
      return  defaultValue;
    }
    return  Date.valueOf(value);
  }





}
