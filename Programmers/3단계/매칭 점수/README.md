[매칭 점수](https://programmers.co.kr/learn/courses/30/lessons/42893)

### 문제에 대한 생각

#### 문제의 조건

1. 웹페이지 URL 획득
2. 참조링크 URL 획득
3. 점수할당
4. 고득점 페이지 반환

#### 풀이

1. URL 획득 : Pattern.compile + Matcher.group -> REGEX 사용
2. 점수할당 : 소수점 점수 유지 -> double
3. 고득점 확인 : Double.compare

### 결과

```
정확성  테스트
테스트 1 〉	통과 (19.66ms, 77.1MB)
테스트 2 〉	통과 (17.22ms, 81.5MB)
테스트 3 〉	통과 (23.66ms, 81.1MB)
테스트 4 〉	통과 (16.97ms, 79.2MB)
테스트 5 〉	통과 (22.18ms, 81MB)
테스트 6 〉	통과 (16.81ms, 83.9MB)
테스트 7 〉	통과 (21.06ms, 78.1MB)
테스트 8 〉	통과 (19.88ms, 78.6MB)
테스트 9 〉	통과 (20.10ms, 78.3MB)
테스트 10 〉	통과 (19.93ms, 74.7MB)
테스트 11 〉	통과 (12.93ms, 68.6MB)
테스트 12 〉	통과 (16.13ms, 79.8MB)
테스트 13 〉	통과 (19.48ms, 80.4MB)
테스트 14 〉	통과 (12.30ms, 80.4MB)
테스트 15 〉	통과 (19.40ms, 81MB)
테스트 16 〉	통과 (20.61ms, 81.7MB)
테스트 17 〉	통과 (23.29ms, 79.3MB)
테스트 18 〉	통과 (13.66ms, 86.3MB)
테스트 19 〉	통과 (10.78ms, 83.2MB)
테스트 20 〉	통과 (17.92ms, 84.6MB)
```