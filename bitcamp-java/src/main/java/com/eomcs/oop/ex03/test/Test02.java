package com.eomcs.oop.ex03.test;

public class Test02 {

  Test02() {
    this.x=300;
  }

  Test02(int a) {
    this.x=300;
  }

  {
    this.x=200;
  }

  int x =100;

}


//package com.eomcs.oop.ex03.test;
//
//public class Test02 {
//  
//  int x;
//  
//  Test02() {
//    x = 100;
//  }
//  
// Test02(int a) {
//   x = 100;
// }
// 
// 
//}


//위와 아래는 클래스파일이 똑같음. 아래 문장은 컴파일러가 위처럼 바꾼다.
//package com.eomcs.oop.ex03.test;
//
//public class Test02 {
//  
//  int x = 100;
//  
//  Test02() {
//  }
//  
// Test02(int a) {
// }
// 
// 
//}
