[블록 이동하기](https://programmers.co.kr/learn/courses/30/lessons/60063)

### 문제에 대한 생각

#### 문제의 조건

1. Map(Graph)의 최단거리
2. 시간의 축적
3. 로봇의 크기 (배열 두개의 공간)

#### 풀이

1. Map(Graph)의 최단거리 : BFS 구현
2. 시간의 축적 : HashMap 을 활용한 Memoization 적용
3. 로봇의 크기 (배열 두개의 공간) : Custom Node 를 Hash Key 로 사용

#### 주의점

1. Node 의 `hashCode()`, `equals()` 를 `Override` 한다.
2. java 에서 제공되는 `hashCode()` 의 특성 [Object.hashCode() 참조](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#hashCode%28%29)
   1. Whenever it is invoked on the same object more than once during an execution of a Java application, the hashCode method must consistently return the same integer, provided no information used in equals comparisons on the object is modified. This integer need not remain consistent from one execution of an application to another execution of the same application.
   2. If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.
   3. __It is not required that if two objects are unequal according to the equals(java.lang.Object) method__, then calling the hashCode method on each of the two objects must produce distinct integer results. However, the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hash tables.
3. 요약하면 자바에서 __Object에 기본적으로 적용되는 `public native int hashCode()` 함수는 고유성을 보장하지 않습니다.__
4. 이러한 이유로 `HashMap`, `HashTable` 은 `hashCode()` 를 `key` 로 저장하지만, 호출시 `key` 와 `value` 를 `equals()` 로 `OR` 조건하에 __중첩 확인하여 불러옵니다.__
5. `HashSet` 또한 `HashMap` 을 활용하기에 상황은 같습니다.
6. 즉 자바의 `Hash Class` 들은 해당 __Key 로 사용되는 Class__ 의 `hashCode()` 와 `equals()` 를 둘다 `Override` 하여 __고유성을 확보해야합니다.__

### 결과

```c

정확성  테스트
테스트 1 〉	통과 (8.24ms, 78MB)
테스트 2 〉	통과 (6.87ms, 77MB)
테스트 3 〉	통과 (6.42ms, 77.9MB)
테스트 4 〉	통과 (11.96ms, 84.1MB)
테스트 5 〉	통과 (9.74ms, 79.7MB)
테스트 6 〉	통과 (10.44ms, 73.3MB)
테스트 7 〉	통과 (14.63ms, 80.4MB)
테스트 8 〉	통과 (17.25ms, 84.9MB)
테스트 9 〉	통과 (17.25ms, 87MB)
테스트 10 〉	통과 (17.08ms, 82.4MB)
테스트 11 〉	통과 (13.67ms, 79.8MB)
테스트 12 〉	통과 (15.17ms, 80.3MB)
테스트 13 〉	통과 (93.83ms, 140MB)
테스트 14 〉	통과 (64.36ms, 120MB)

```
