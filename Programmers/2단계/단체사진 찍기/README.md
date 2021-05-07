[단체사진 찍기](https://programmers.co.kr/learn/courses/30/lessons/1835)

### 문제에 대한 생각
- 순열 & 조합 ?
    - N! 의 전체집합 ( 비조건인 모든 경우의 수 )
        - 중복확인 후 포함 ( 재귀 )
            - order.indexOf(next) ?
            - recursive(order + next)
    - 조건순회 : false -> break(return);
- 사실상 int n 이 필요한 지 의문.


```
정확성  테스트
테스트 1 〉	통과 (2707.54ms, 357MB)
```