[핸드폰 번호 가리기](https://programmers.co.kr/learn/courses/30/lessons/12948)

### 문제에 대한 생각
- array(char[]) > Object(String) : 속도차이
- regex
    - 앞부분, 뒷부분 조건 및 이를 제외한 값
    - lookahead 단위조건 : ex) m/s 의 수치만 사용할 경우
    - lookbehind 분류조건 : ex) 핸드폰의 지역 및 나라구분, 82)010-

|lookaround||||
|-|-|-|-|
|lookahead||lookbehind||
|positivie|negative|positivie|negative|
|(?=.)|(?!.)|(?<=.)|(?<!.)|