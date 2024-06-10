### 상속
공통 기능은 상속 관계를 사용하는 것이 효과적이다.


### 상속 관계
- 상속은 부모의 기능을 자식이 물려 받는 것이다. 이름 그대로 기존 클래스의 속성과 기능을 그대로 물려받는 것이다.
- 기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용하게 해준다. extends 키워드를 사용하며, 하나의 대상만 선택할 수 있다.
- 부모 클래스 (슈퍼 클래스): 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공하는 클래스
- 자식 클래스 (서브 클래스): 부모 클래스로부터 필드와 메서드를 상속받는 클래스
- 자바는 다중 상속을 지원하지 않는다.(단일 상속) 인터페이스의 다중 구현을 허용해 이러한 문제를 피한다.


### 상속과 메모리 구조
- 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성된다.
- 상속 관계의 객체를 호출할 때, 대상 타입을 정해야 한다. 이때 호출자의 타입을 통해 대상 타입을 찾는다.
- 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행한다. 기능을 찾지 못하면 컴파일 오류가 발생한다.


### 상속과 기능 추가
- 부모에 기능을 추가하면 자식들은 해당 기능을 모두 물려받게 된다. 상속 관계 덕분에 중복은 줄어들고, 새로운 기능을 편리하게 확장(extend)한 것을 알 수 있다


### 상속과 메서드 오버라이딩
- 부모에게서 상속 받은 기능을 자식이 재정의 하는 것
- @Override 컴파일러는 이 애노테이션을 보고 메서드가 정확히 오버라이드 되었는지 확인한다. 만 코드의 명확성을 위해 붙여주는 것이 좋다.


**메서드 오버라이딩 조건**
- 메서드 이름: 메서드 이름이 같아야 한다.
- 메서드 매개변수(파라미터): 매개변수(파라미터) 타입, 순서, 개수가 같아야 한다.
- 반환 타입: 반환 타입이 같아야 한다. 단 반환 타입이 하위 클래스 타입일 수 있다.
- 접근 제어자: 오버라이딩 메서드의 접근 제어자는 상위 클래스의 메서드보다 더 제한적이어서는 안된다
- static , final , private : 키워드가 붙은 메서드는 오버라이딩 될 수 없다.
- 생성자는 오버라이딩 할 수 없다.


### 상속과 접근 제어
Child 는 부모의 public, protected 필드나 메서드만 접근할 수 있다. 
반면에 Parent.printParent()의 경우 Parent 안에 있는 메서드이기 때문에 Parent 자신의 모든 필드와 메서드에 얼마든지 접근할 수 있다.


### super - 부모 참조
부모와 자식의 필드명이 같거나 메서드가 오버라이딩 되어 있으면, 자식에서 부모의 필드나 메서드를 호출할 수 없다.
이때 super 키워드를 사용하면 부모를 참조할 수 있다. super 는 이름 그대로 부모 클래스에 대한 참조를 나타낸다.


### super - 생성자
- 상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순서로 실행된다. 따라서 부모의 데이터를 먼저 초기화하고 그 다음에 자식의 데이터를 초기화한다.
- 상속 관계에서 자식 클래스의 생성자 첫줄에 반드시 super(...) 를 호출해야 한다. 단 기본 생성자 ( super() )인 경우 생략할 수 있다.

### 정리
- 클래스에 final
  - 상속 끝!
  - final 로 선언된 클래스는 확장될 수 없다. 다른 클래스가 final 로 선언된 클래스를 상속받을 수 없다.
    - 예: public final class MyFinalClass {...}
- 메서드에 final
  - 오버라이딩 끝!
  - final 로 선언된 메서드는 오버라이드 될 수 없다. 상속받은 서브 클래스에서 이 메서드를 변경할 수 없다.
    - 예: public final void myFinalMethod() {...