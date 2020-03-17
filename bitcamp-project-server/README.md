# 48_1 - 인터페이스 대신 애노테이션으로 메서드 구분하기

인터페이스는 규칙이기 때문에 구현이 매우 엄격하다.
메서드 이름에서 파라미터 타입/ 개수, 리턴타입까지 정확하게 구현해야 한다.
애노테이션을 사용하면 인터페이스 보다 더 유연하게 규칙을 처리할 수 있다.


## 학습목표






## 실습 소스 및 결과

- src/main/java/com/eomcs/util/Component.java 추가
- src/main/java/com/eomcs/util/ApplicationContext.java 추가
- src/main/java/com/eomcs/lms/service/impl/BoardServiceImpl2.java 삭제
- src/main/java/com/eomcs/lms/service/impl/XxxServiceImpl.java 변경
- src/main/java/com/eomcs/lms/servlet/XxxServlet.java 변경
- src/main/java/com/eomcs/lms/DataLoaderListener.java 의 이름 변경
  - ContextLoaderListener.java 로 이름 변경

## 실습  

### 훈련1: