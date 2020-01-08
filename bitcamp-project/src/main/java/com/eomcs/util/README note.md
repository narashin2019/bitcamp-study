# ArrayList 클래스 정의 과정

-ArrayList 클래스의 역할: 여러 개의 객체 주소 저장, 찾아서 꺼냄, 목록전체 리턴,
특정 위치에 있는 객체 변경 또는 삭제할 수 있음.

- 1) 최소 클래스 정의
패키지정보가 첫째줄
클래스를 정의한다.
util패키지 안에서만 쓸꺼면 private/ 다른 패키지에서도 쓸꺼면 public

- 2) 객체 목록을 다룰 때 사용할 인스턴스 변수 준비
객체 주소 여러 개 담으려면 레퍼런스 배열 필요함.
모든 객체 주소 받을 수 있는 게 자바에서는 Object이다. 따라서 오브젝트 배열 생성.
elementData : 어레이리스트 자바에 있는 용어로 사용
int size; // 몇개를 저장했는지 가리키는 변수

=====================================================
- 3) 인스턴스 변수 초기화를 생성자로 옮긴다.

생성자는 보통 퍼블릭, 생성자 첫줄은  super();
  
public class ArrayList {
Object[] elementData = new Object[100];
int size; 
  
public ArrayList() {
    super();
}
  
=> 실제 컴파일러는 위의 문장을 아래처럼 바꿈(생성자로 복사 )

public class ArrayList {

  Object[] elementData;
  int size;
  
  
  public ArrayList() {
    super();
    
    this.elementData = new Object[100];
    this.size = 0;
  }

필드에서 할당연산자로 작성하면 컴파일러는 실제 컴파일 시 생성자로 옮긴다.
인스턴스 객체 초기화 믄장도 마찬가지다. 
변수(필드) 초기화 시키는 문장을 컴파일러는 생성자로 옮긴다.
따라서 필드에는 초기화식이 꼭 없어도 된다. 생성자에서 초기화하면 된다. 

그래서 초기화를 변수선언 다음에 하나 생성자에 넣나 똑같다. 선택사항인데 후자 추천.
컴파일러는 변수선언 우측에 초기화 값을 내부적으로 생성자 안에 넣는 것으로 변환한다.


기본형 변수는 초기화 안해도 0으로 초기화된다.  
그래서 생성자 안에 this.size = 0; 뺴도 된다.
참고로 레퍼런스는 null로 초기화 자동으로 된다.


=================================================

- 4) 배열의 초기 크기를 설정할 수 있는 생성자를 추가한다.

ArrayList를 만들 때 개발자는 자기 목적에 맞게
배열 최대 개수 조절할 수 있는 형태로 만든다.
초기화 값이 목적에 따라 달라질 수 있다면 생성자로 하는게 낫다
-> 그래서 생성자 2개 만듬.

생성자로 넣으면 장점: 배열 값 정하는 초기값을 사용자가 정할 수 있다.

변수이름: initialCapacity로 하십시오..

=================================================

- 5) 생성자에 있는 수퍼 클래스의 기본 생성자 호출 문장을 생략한다.

수퍼클래스 기본생성자 호출 문장 super();는 생략 가능하다.


=================================================

- 6) 배열의 기본 크기를 직접 지정하지 않고 상수로 정의한 후 그 상수를 사용한다.

 private static final int DEFAULT_CAPACITY = 10;
상수는 바뀌지 않는다. => 스태틱 변수로 만들어라
해당클래스 내부에서만 쓴다 => private
기본배열 생성 시 10개생성으로고정
ArrayList.DEFAULT_CAPACITY 에서 앞에 ArrayList. 생략 같은 클래스니까.

=================================================

- 7) 생성자에서 배열을 만들 때 초기 크기가 기본 크기 보다 작다면 기본 크기로 배열을 만든다.
조건문!


=================================================
- 8) 객체를 목록에 저장하는 add() 메서드를 정의한다.

외부에서 접근하니까 public

  public void add(Object e) {
    this.elementData[this.size] = e;
    this.size++;
  }

외부에서 식판1개 주소를 가리키는 레퍼런스 e를 받아서 지금 배열에 담는다. 그리고 1개추가했으니 쁠쁠
쁠쁠을 식 안에 쓸 수 있다.  this.elementData[this.size++] = e;

=================================================
- 9) 객체를 목록에서 꺼내는 get() 메서드를 정의한다.

배열의 인덱스 주면 오브젝트의 자식들 중 해당하는 인덱스의 데이터를 티런할 거다.

=================================================

- 10) 목록의 저장된 특정 위치의 값을 변경하는 set() 메서드를 정의한다.

  public void set(int index, Object e) {
    this.elementData[index] = e;
  }

인덱스로 받은 해당 방에 e를 넣음.
=====================================================

- 11) 목록에 저장된 특정 위치의 값을 삭제하는 remove() 메서드를 정의한다.

반복문 사용한다.

  public void remove(int index) {
    for (int i = index + 1; i < this.size; i++) {
      this.elementData[i-1] = this.elementData[i];
    }
    
    this.size--;
  }
=> 그림으로 그리면 쉬움!!

=====================================================
- 12) add() 변경: 배열이 꽉 차면 50% 증가시킨다. 

  public void add(Object e) {
    if (this.size == this.elementData.length) {
      int oldSize = this.elementData.length;
      int newSize = oldSize + (oldSize >>1);

      this.elementData = Arrays.copyOf(this.elementData, newSize);

      /*
      Object[] newArr = new Object[newSize];
     //새배열에 기존 값을 반복문으로 넣는다
      for (int i = 0; i < this.size; i++) {
        newArr[i] = this.elementData[i];
      }
      this.elementData = newArr; // 새 배열의 주소를 엘레멘트데이터에 준다

      */
    }
      this.elementData[this.size++] = e;
    }


======================================================
- 13) get() 변경: 유효한 인덱스가 아니면 null을 리턴한다.

유효코드는 if로 

==============================================
- 14) set() 변경: 유효한 인덱스가 아니면 메서드를 실행하지 않는다.

유효코드 if는 위에 썼던거 쓴다. 
==========================================
- 15) set() 변경: 변경한 후 변경 전의 값을 리턴한다.
왜?
변경 전 값을 사용할 수 있어서 보통 변경 전 값을 리턴하도록 코드 짠다.

테스트시, 변경전 값과 변경후 값 보려면 아래와 같이 귀찮게 호출해야한다.
  String oldValue = (String)a1.get(0);
  a1.set(0, "asd");
  System.out.printf("%s ==> %s\n", oldValue, a1.get(0));

=>코드를 코치면 아래와 같이 호출할 수 있다.
String oldValue = (String)a1.set(0, "asd");



================================================
- 16) remove() 변경: 유효한 인덱스가 아니면 메서드를 실행하지 않는다.

>테스트코드
    String oldValue = (String)a1.get(0);
    a1.remove(0);
    System.out.printf("삭제전(%s) ==> 삭제 후(%s)\n", oldValue, a1.get(0));
    


==================================================
- 17) remove() 변경: 삭제한 후 삭제 전의 값을 리턴한다.


> 테스트 코드:
    String oldValue = (String)a1.get(0);
    System.out.printf("삭제전(%s) ==> 삭제 후(%s)\n", oldValue, a1.get(0));



=======================================
- 18) size 필드 값을 리턴할 size() 메서드를 정의한다.
 size값 함부로 바꾸지 않게
size를 변수가 아니라 메서드로 사용 
=======================================

- 19) remove() 변경: System.arraycopy()를 사용하여 삭제를 처리한다.


  public Object remove(int index) {
    if (index < 0 || index >= this.size) {
      return null;
    }
    Object oldValue = this.elementData[index];

    for (int i = index + 1; i < this.size; i++) {
      this.elementData[i-1] = this.elementData[i];
    }

    this.size--;
    return oldValue;
  }

=>
System.arraycopy()를 사용하여 삭제를 처리한다!!!


System.arraycopy(this.elementData, index+1, 
this.elementData, index, this.size- (index+1));

원래 배열의 3번부터 끝까지를 원래배열에 2번부터 끝까지 집어넣어라.


> 테스트 코드 
String oldValue = (String)a1.get(5);
System.out.printf("삭제전(%s) ==> 삭제 후(%s)\n", oldValue, a1.get(0));
    


===================================================
- 20) 목록에 저장된 객체를 배열로 리턴하는 toArray() 메서드를 정의한다.

 public Object[] toArray() {
    Object[] arr = new Object[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.elementData[i];
    }
    return arr;
  }
  
>테스트 코드: 
  static void print(ArrayList arr) {
    for (int i = 0; i < arr.size; i++) {
      System.out.println(arr.get(i));
    }
  }
===> 바뀜!!!
  static void print(ArrayList arr) {
    Object[] list = arr.toArray();
    for (Object e : list) {
      System.out.println(e);
    }
  }

=================================================

- 21) toArray() 변경: Arrays.copyOf()를 사용하여 리턴할 배열을 만든다.

 return Arrays.copyOf(this.elementData, this.size);
이 메소드는  this.size 사이즈의 뉴 배열 만들어서 this.elementData,를 복사한다!

=======================================================
- 22) ArrayList에 제네릭(generic)을 적용한다.

제네릭 적용*********

오브젝트로 하니까 테스트시 String으로 타입캐스팅함

ArrayList가 다룰 객체 타입을 E라고 가정하자 : public class ArrayList<E>

워닝 띄우지 말라고 애노테이션 꼭해

   E oldValue = (E) this.elementData[index]; (E) : E타입이다라는 뜻

>테스트시 
  ArrayList<String> a1 = new ArrayList<>();
E가 뭔지 알려줘야해. 스트링이다라고 알려주면 
밑에서 출력 코드에서는  String oldValue = a1.get(0) 타입 캐스팅 없이 하면 됨.


생성자와 필드는 Object를 그냥 둔다. E로하면 new가 안됨!!!!
어레이 메서드들도 내부적으로는 Object를 그냥 씀.

=============================
- 23) 제네릭으로 지정된 타입의 배열을 리턴하는 toArray()를 추가한다.

잘 이해가 안된다........

타입을 받아서 리턴하는 toArray사용
public Object[] toArray() {
return Arrays.copyOf(this.elementData, this.size);
}
와

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    return (E[]) Arrays.copyOf(this.elementData, this.size, arr.getClass());
  }
  
차이: 

생성할 배열의 타입arr.getClass()을 지정하게 되면 배열 타입을 배열로 받음


테스트>

  static void print(ArrayList<String> arr) {
  String[] list = arr.toArray(new String[] {});
    for (String e : list) {
      System.out.println(e);
    }
  }

> size만큼 딱 맞춰서 생성하는법?
 static void print(ArrayList<String> arr) {
  String[] list = new String[arr.size()];
    arr.toArray(list);
    for (String e : list) {
      System.out.println(e);
    }
  }
  
  
    @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    return (E[]) Arrays.copyOf(this.elementData, 
        this.size, arr.getClass());
  //=>Arrays.copyOf(original, newLength, newType)
   
  }
============================================================

- 24) toArray(E[] arr) 변경: 파라미터로 받은 배열이 넉넉하다면 
새로 배열을 만들지 않고 그대로 사용한다. > 조건문



 
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if(arr.length < this.size) {
      // 즉 파라미터로 받은 배열이 작을 때는 새배열을 만들어 리턴.
    return (E[]) Arrays.copyOf(this.elementData, this.size, arr.getClass());
    } 
    System.arraycopy(this.elementData, 0, arr, 0, this.size);
    //this.list를 0번방부터 arr에 0번방부터 this.size만큼 복사한다
    return arr; // 넉넉할 때는 파라미터로 받은 배열을 그대로 리턴
  }
  
* 제네릭은  E[] arr = new = E[100]; 이거 안됨  배열을 뉴로 못만듬


  
==========================================


- 25) 목록 중간에 값을 삽입하는 add(int,E) 메서드를 정의한다.
- 26) add()와 add(int,E)에 중복 작성된 배열을 늘리는 코드를 grow() 메서드로 분리한다.  
- 27) grow() 메서드에서 새 배열의 크기를 계산 코드를 newCapacity() 메서드로 분리한다. 

