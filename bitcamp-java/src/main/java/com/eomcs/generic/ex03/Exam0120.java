package com.eomcs.generic.ex03;

import java.lang.reflect.Array;

public class Exam0120 {

  // 제네릭의 타입을 지정할 때 수퍼 클래스를 지정하면 그 타입 및 서브 타입만 가능하다.
  // => 다음 클래스의 타입 파라미터에는 
  //    Manager나 그 하위 클래스만 지정할 수 있다. (=매니저 계열이라고 줄여 말함)
  // (ArrayList 레퍼런스나 인스턴스를 만들때는 매니저 계열=매니저와 그 서브클래스인 어드미니스트레이터만 된다.)
  
  static class ArrayList<T extends Manager> { 
    T[] arr;
    int index = 0;


    @SuppressWarnings("unchecked")
    public ArrayList(Class<?> clazz) {
      // 제네릭 타입 파라미터로 레퍼런스는 선언할 수 있지만 인스턴스를 생성할 수 없다. (뉴로 생성하는 건 다 안된다. )
      //this.arr = new T[10]; // 컴파일 오류!
      //T p = new T(); // 컴파일 오류!
      
      // 다음과 같이 Array.newInstance()로 배열 인스턴스를 생성해야 한다.
      this.arr = (T[])Array.newInstance(clazz, 10);
    }

    public void add(T v) {
      arr[index++] = v;
    }

    public T get(int index) {
      return arr[index];
    }
  }


  public static void main(String[] args) {

    //ArrayList<Member> obj = new ArrayList<>(Member.class); // 컴파일 오류!
    //ArrayList<Teacher> obj = new ArrayList<>(Member.class); // 컴파일 오류!
    //ArrayList<Student> obj = new ArrayList<>(Member.class); // 컴파일 오류!

    ArrayList<Manager> obj = new ArrayList<>(Member.class); // OK!!
    // ArrayList<Administrator> obj = new ArrayList<>(Administrator.class); //OK!!
    
    obj.add(new Manager());
    obj.add(new Administrator());
    
    System.out.println(obj.get(0));
    System.out.println(obj.get(1));
  }

}
