package com.eomcs.algorithm.data_structure.linkedlist;

public class LinkedListTest {

  public static void main(String[] args) {
    
    LinkedList<String> list = new LinkedList<>(); // 제네릭 적용 이제 스트링만 넣어야함. 제네릭을 쓰면 제약을 가할 수 있다 특정타입만 넣도록
    
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    list.add("fff");
    list.add("ggg");
    
   
    
    //System.out.println(list.set(0, "xxx")); // 이전값리턴
    //System.out.println();
    
    //list.add(0, "xxx"); //0번문제, 하나씩밀림, -1, 7은 유효하지 않아서 아무일도 안일어남
    
    //list.remove(0); //  0번째가 문제 똑같, -1, 7은 유효하지 않아서 아무일도 안일어남
    
    //System.out.println(list.get(7)); //유효범위 벗어낫을때 

    print(list);
    
    
  }

  
//  static void print(LinkedList list) {
//    for (int i = 0; i < list.size; i++) {
//      System.out.println(list.get(i));
//    }
//  }
//  

  static void print(LinkedList<String> list) {
    //String[] arr = list.toArray(new String[0]);
    // 빈배열을 넘기면 지가 알아서 생성해서 넣을 것이고, 
    //사이즈 있는 배열을 주면 거기에 값을 넣을 것이다.
    
    String[] arr = new String[list.size()]; //사이즈를 변수가 아닌 메소드로 쓰고.
    list.toArray(arr); //사이즈만한 배열을 만들어서 arr로 넘겨줌.
    
    for (String value : arr) {
      System.out.println(value);
    }
  }
  
  


}
