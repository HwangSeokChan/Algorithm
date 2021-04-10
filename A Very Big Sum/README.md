[A Very Big Sum](https://www.hackerrank.com/challenges/a-very-big-sum/problem)

In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

__Function Description__

Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

aVeryBigSum has the following parameter(s):

- int ar[n]: an array of integers .

__Return__

- long: the sum of all array elements

__Input Format__

The first line of the input consists of an integer .
The next line contains  space-separated integers contained in the array.

__Output Format__

Return the integer sum of the elements in the array.
  
---
  
## __문제에 대한 생각__

[Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

합계문제는 변수에 따른 OverFlow 를 고려한다.

|DataType|	Default Value (for fields)|Size|Range|
|-|-|-|-|
|byte|	0|1byte|-128 to 127|
|short|	0|2byte|-32,768 to 32,767|
|int|	0|4byte|-2,147,483,648 to 2,147,483,647|
|long|	0L|8byte|-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
|float|	0.0f|4byte|Sufficient for storing 6 to 7 decimal digits \( fractional numbers \)|
|double|	0.0d|8byte|Sufficient for storing 15 decimal digits \( fractional numbers \)|
|boolean|	false|1byte|true or false values|
|char|	'\u0000'|1byte|a single character/letter or ASCII values|
|String| (or any object)  	null|.|.|
  
---
  
문제에서 제시한  

-10^{10} ~ 10^{10}

는 int 의 범위와 유사하기에 long 이 필수가 된다.  
이보다 큰 범위도 있지만, 일반적으로 사용되지 않는다.

Long.parseUnsignedLong(num)

자바 초기개발자(제임스 고슬링)은 복잡성을 이유로 Unsigned를 반대했다.  
하지만 오라클의 자바 인수와 고슬링이 퇴사로 Java8에서 변수별 클레스의 메소드로 제공되었다.  
여기에서 몇가지 연산은 별도 메소드를 통해 대체되지만, 큰 이유가 없으면 사용은 지양한다.  

|Op|Method|
|-|-|
| /|divideUnsigned|
| %|remainderUnsigned|
|==|compareUnsigned|
