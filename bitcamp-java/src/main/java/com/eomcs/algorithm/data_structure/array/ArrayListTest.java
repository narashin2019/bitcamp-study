package com.eomcs.algorithm.data_structure.array;

import com.eomcs.lms.domain.Member;

public class ArrayListTest {

  public static void main(String[] args) {
    
    ArrayList<String> a1 = new ArrayListOld<>();
    
    ArrayList a2 = new ArrayListOld(100);
    

    // 어떤 add를 쓸지 (위에서 2개 만듬) 주소를 줘야 한다. a1인지 a2인지 
    // a1이 add메서드 가면 this가 있어서 걔가 주소 받음.
    // 그럼 this가 1200번지 찾아가서 0번방에 aaa넣고 사이즈는 1 증가시키고
    //같은 add인데 주소적힌 쪽지가 다름
    //메서드는 1개 인데 어떤 객체를 가지고 일할지는 add 앞에 인스턴스 주소로 결정.
    a1.add("aaa");
    a1.add("bbb");
    a1.add("ccc");
    a1.add("ddd");
    a1.add("eee");
    a1.add("fff");
    a1.add(new Member());// 컴파일 오류???
    
    a2.add("111");
    a2.add("222");
    
    System.out.println(a1.get(-1));
    System.out.println(a1.get(6));
    
//    String oldValue = (String)a1.get(0);
//    a1.set(0, "asd");
//    System.out.printf("%s ==> %s\n", oldValue, a1.get(0));
    //=> 아래처럼
    //String oldValue = (String)a1.set(0, "asd");
    
    
    a1.set(-1, "yyy");
    
    
    System.out.println("----------------------------");
    
  
    System.out.println(a1.get(0));
    
    a1.set(0, "xxx");
    
    System.out.println(a1.get(0));
    
  System.out.println("--------------------------");
    
    print(a1);
    
    a1.remove(0);
    
    print(a1);    
    
    
    String oldValue = (String)a1.get(5);
    System.out.printf("삭제전(%s) ==> 삭제 후(%s)\n", oldValue, a1.get(0));
    
//    String value = (String) a1.get(0); // get메서드는 리턴 타입이 Object타입 인데 컴파일러는 object만 리턴한다고 생각하는데 오브젝트가 아닌 스트링에 저장한다고 생각해서, 원래 들어가있는 타입이 (String)이 맞다고 타입캐스팅함. 타입캐스팅은 거짓말하면 안된다. 컴파일러에게 진실을 알려주는 것. 
//    System.out.println(value);
// => System.out.println(a2.get(0)); //위에 처럼 굳이 임시변수에 넣을 필요 없어.

  
  
  
  }
  
  static void print(ArrayList<String> arr) {
  String[] list = arr.toArray(new String[] {});
    for (String e : list) {
      System.out.println(e);
    }
  }

}
