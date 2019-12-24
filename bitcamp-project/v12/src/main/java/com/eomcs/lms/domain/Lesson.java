package com.eomcs.lms.domain;

import java.sql.Date;

public class Lesson { //다른 클래스에서 접근디도롤 모두 public 
  public int no;
  public String title;
  public String description; 
  public Date startDate;
  public Date endDate;
  public int totalHours;
  public int dayHours;
}

