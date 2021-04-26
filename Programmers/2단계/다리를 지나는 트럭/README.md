[다리를 지나는 트럭](https://programmers.co.kr/learn/courses/30/lessons/42583)

### 문제에 대한 생각
- time 에 대한 Loop
- Queue 의 사용
    - Queue 에 조건적합 대상 추가
    - Queue 에서 timeout 대상 제거
    - Queue 목록처리 완료 확인

- ConcurrentModificationException
    - Collections 의 loop + remove 로 발생
    - Iterator 를 사용한 Collections 객체 정보변경으로 해결

```
정확성  테스트
테스트 1 〉	통과 (2.26ms, 53.2MB)
테스트 2 〉	통과 (10.87ms, 55MB)
테스트 3 〉	통과 (0.41ms, 52.2MB)
테스트 4 〉	통과 (9.05ms, 53.8MB)
테스트 5 〉	통과 (39.38ms, 62.5MB)
테스트 6 〉	통과 (20.11ms, 55.1MB)
테스트 7 〉	통과 (1.83ms, 52.6MB)
테스트 8 〉	통과 (0.73ms, 52.4MB)
테스트 9 〉	통과 (5.58ms, 54.2MB)
테스트 10 〉	통과 (0.86ms, 53.1MB)
테스트 11 〉	통과 (0.19ms, 52.4MB)
테스트 12 〉	통과 (1.24ms, 52MB)
테스트 13 〉	통과 (2.48ms, 52.5MB)
테스트 14 〉	통과 (0.39ms, 52.2MB)
```