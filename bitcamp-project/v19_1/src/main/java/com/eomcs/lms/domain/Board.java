package com.eomcs.lms.domain;

import java.sql.Date;

public class Board { 
  //private로 바꿈
  private int no;
  private String title;
  private Date date;
  private int viewCount;
  private String writer;
  
  //게터/세터를 이용해 저장 출력 되도록 함. 게터/세터는 public
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
  public String getWriter() {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  
  
}


