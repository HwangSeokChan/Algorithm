[Staircase](https://www.hackerrank.com/challenges/staircase/problem)

### 문제에 대한 생각
> Loop, Escape 를 떠올리게 된다.  
> 반복적인 모음을 Loop 문을 1회 또는 2회를 사용할지, 혹은 객체함수를 응용할지 생각해야한다. Escape 의 경우, 다음 공간관련 문자는 여백보단 지정 Character 를 쓰는것이 가독성에 좋다.

|문자|명칭|동작|
|-|-|-|
|\r|Return|Carriage Return|
|\n|New Line|Line Feed|
|\s|Space|Blank Space|
|\b|Back Space|Delete Front Character|
|\t|Tab|Uniform Space|
  
> 여기서 \r, \n 의 경우, 본래 CRLF 명칭으로 과거 타자기 시절의 새로운 행\(New Line\)을 바꾸는 방식을 의미한다. Carriage Return 은 행의 고정 및 열의 선두로 이동, Line Feed 는 한 행 아래 이동 및 열의 고정을 뜻한다. 이는 운영체제별로 차이가 있다. Windows의 경우 \r\n 을 그대로 사용하고, Unix 및 그의 파생 OS들은 \n 하나로 CRLF 동작을 수행한다.