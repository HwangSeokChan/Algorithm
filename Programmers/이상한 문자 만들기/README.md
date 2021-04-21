[이상한 문자 만들기](https://programmers.co.kr/learn/courses/30/lessons/12930)

### 문제에 대한 생각
- split(regex)
    - split(regex, 0)과 같다.
- split(regex, limit)  

|||||
|-|-|-|-|
||limit > 0|limit = 0|limit < 0|
|제한횟수|O(limit)|X|X|
|끝부분공백||***제거된다.***|***유지된다.***|