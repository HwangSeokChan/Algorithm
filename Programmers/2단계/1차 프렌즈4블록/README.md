[1차 프렌즈4블록](https://programmers.co.kr/learn/courses/30/lessons/17679)

[공식해설](https://tech.kakao.com/2017/09/27/kakao-blind-recruitment-round-1/)

### 문제에 대한 생각
- markUp : 삭제블록 표시
- fallDown : 삭제블록 생략 정렬
- count : 삭제블록 갯수
- deleted : 삭제여부 확인
  - loop : 삭제되지 않을 경우 종료


- Old - Map 사용
```
정확성  테스트
테스트 1 〉	통과 (9.50ms, 54MB)
테스트 2 〉	통과 (8.94ms, 53MB)
테스트 3 〉	통과 (0.03ms, 52.3MB)
테스트 4 〉	통과 (8.40ms, 53.4MB)
테스트 5 〉	통과 (160.17ms, 76.1MB)
테스트 6 〉	통과 (33.66ms, 55.8MB)
테스트 7 〉	통과 (5.34ms, 53.8MB)
테스트 8 〉	통과 (18.41ms, 54.2MB)
테스트 9 〉	통과 (10.33ms, 52.8MB)
테스트 10 〉	통과 (12.85ms, 54.6MB)
테스트 11 〉	통과 (19.03ms, 54.1MB)
```

- New - Array 사용
```
정확성  테스트
테스트 1 〉	통과 (0.24ms, 52.2MB)
테스트 2 〉	통과 (0.35ms, 58.2MB)
테스트 3 〉	통과 (0.21ms, 51.8MB)
테스트 4 〉	통과 (1.45ms, 53.5MB)
테스트 5 〉	통과 (38.01ms, 59MB)
테스트 6 〉	통과 (6.81ms, 52.4MB)
테스트 7 〉	통과 (1.33ms, 53.3MB)
테스트 8 〉	통과 (1.54ms, 53.3MB)
테스트 9 〉	통과 (0.27ms, 52.6MB)
테스트 10 〉	통과 (1.57ms, 52.7MB)
테스트 11 〉	통과 (2.76ms, 53.3MB)
```