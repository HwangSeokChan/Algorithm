[3진법 뒤집기](https://programmers.co.kr/learn/courses/30/lessons/68935)

### 문제에 대한 생각
- 속도
    - 테스트
        - StringBuffer + Integer > CharArray + Loop
    - 결과
        - 100배 ( 0.10ms vs 10.00ms )
    - String, Integer 특징
        - static array for digits
        - parse char to byte buffer
    - 결론
        - 진법문제는 String + Integer 변환식을 사용하는걸 지향