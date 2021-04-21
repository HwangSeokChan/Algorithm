[다트 게임](https://programmers.co.kr/learn/courses/30/lessons/17682)

### 문제에 대한 생각
- 연산자와 피연산자 분류
    - regex를 이용
        - split('연산자') : 피연산자
        - split('피연산자') : 연산자 -> 첫시작이 피연자이므로 index 0 이 null 임을 고려
- 대상범위 한계 활용
    - 피연산자 0~10 : 10또는 0의 경우의 예외를 고려
    - 연산자 SDT*#