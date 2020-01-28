// 활용 - 지정한 폴더에서 .class 파일만 찾아 출력하라.
package com.eomcs.io.ex01;

import java.io.File;
import java.io.FileFilter;

public class Exam0730 {

  public static void main(String[] args) throws Exception {

    File dir = new File("bin/main");
    System.out.println(dir.getCanonicalPath());

    printList(dir);
  }

  static void printList(File dir) {


    // 현재 디렉토리의 하위 파일 및 디렉토리 목록을 알아낸다.
    // 익명클래스 객체 생성법 1. new붙인다 2. 뒤에 {}연다 3. 수퍼클래스의생성자()호출하도록()붙임 4. {안에 메서드 오버라이드한다}

    File[] files = dir.listFiles(new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        if (pathname.isHidden()) {
          return false;
        }

        if (pathname.getName().contains("$")) {
          return false;
        }

        if (pathname.isDirectory()
            || (pathname.isFile() && pathname.getName().endsWith(".class"))) {
          return true;
        }
        return false;
      }
    });


    // 리턴 받은 파일 배열에서 이름을 꺼내 출력한다.
    for (File file : files) {
      if (file.isDirectory()) {
        printList(file);
      } else {
        System.out.printf("%s\n", file.getName());
      }
    }
  }

  static void printIndent(int level) {
    for (int i = 0; i < level; i++) {
      System.out.print("  ");
    }
  }

}


