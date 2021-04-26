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