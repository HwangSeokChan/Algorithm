# [3차 파일명 정렬](https://programmers.co.kr/learn/courses/30/lessons/17686)

## 문제에 대한 생각

> - Head / Number / Tail 구분
>   - Head
>       - 대소문자 구분 X
>   - Number
>       - 정수비교
>   - Tail
>       - 재사용 (X) : ~~Number 까지의 정렬만 요구된다.~~
> - Sort
>   - Recursive
>       - List
>       - Matcher
>   - Not Recursive
>       - Index Count

### RegEx ( 재사용 고려할 경우 )
```bash
$regex = "Digit or Not Digit"
a = s1.toCase().matcher($regex)
b = s2.toCase().matcher($regex)
while a.hasNext() && b.hasNext() && a.equal(b) ? do
    if isDigit then $result = Integer.compare(a.next(),b.next())
    else $result = a.next().compare(b.next())
    isDigit ^= true;
done

return $result != 0 ? $result
        a.hasNext() ? 'A IS LONG > SWAP' :
        b.hasNext() ? 'B IS LONG > STAY' :
        'NO MORE > STAY'

정확성  테스트
테스트 1 〉	통과 (1.51ms, 52.1MB)
테스트 2 〉	통과 (2.26ms, 52.9MB)
테스트 3 〉	통과 (122.70ms, 70.9MB)
테스트 4 〉	통과 (110.88ms, 69.9MB)
테스트 5 〉	통과 (129.62ms, 70.4MB)
테스트 6 〉	통과 (127.91ms, 69.7MB)
테스트 7 〉	통과 (109.79ms, 69.5MB)
테스트 8 〉	통과 (115.16ms, 68.4MB)
테스트 9 〉	통과 (127.64ms, 69.1MB)
테스트 10 〉	통과 (117.21ms, 68.7MB)
테스트 11 〉	통과 (93.46ms, 69.3MB)
테스트 12 〉	통과 (124.79ms, 70.6MB)
테스트 13 〉	통과 (50.42ms, 57.2MB)
테스트 14 〉	통과 (50.69ms, 58.4MB)
테스트 15 〉	통과 (60.22ms, 58.4MB)
테스트 16 〉	통과 (112.77ms, 70.1MB)
테스트 17 〉	통과 (54.91ms, 58.1MB)
테스트 18 〉	통과 (96.37ms, 64.4MB)
테스트 19 〉	통과 (97.84ms, 64.4MB)
테스트 20 〉	통과 (109.01ms, 65.3MB)
```

### Index Count ( 1회만 비교할 경우 )
```bash

string.toCase();

$index = 0;

while ( $index < length && 'string.charAt($index) is not digit' ) index count;
$strEnd = $index;

while ( $index < length && 'string.charAt($index) is digit' ) index count;
$digitEnd = $index;

$str = string.subString(0, $strEnd);
$digit = string.subString($strEnd, $digitEnd);

return Compare($strA, $strB) || Compare($digitA, $digitB) 


정확성  테스트
테스트 1 〉	통과 (0.63ms, 52.9MB)
테스트 2 〉	통과 (0.53ms, 52.7MB)
테스트 3 〉	통과 (35.94ms, 59.2MB)
테스트 4 〉	통과 (31.75ms, 59MB)
테스트 5 〉	통과 (31.69ms, 57.2MB)
테스트 6 〉	통과 (32.84ms, 59.4MB)
테스트 7 〉	통과 (28.98ms, 59.4MB)
테스트 8 〉	통과 (26.29ms, 57.1MB)
테스트 9 〉	통과 (35.14ms, 56.4MB)
테스트 10 〉	통과 (27.76ms, 57.8MB)
테스트 11 〉	통과 (26.97ms, 58.7MB)
테스트 12 〉	통과 (31.86ms, 58.7MB)
테스트 13 〉	통과 (16.37ms, 53.9MB)
테스트 14 〉	통과 (12.26ms, 55.6MB)
테스트 15 〉	통과 (12.23ms, 55.1MB)
테스트 16 〉	통과 (29.98ms, 57.5MB)
테스트 17 〉	통과 (9.54ms, 53.9MB)
테스트 18 〉	통과 (16.55ms, 58MB)
테스트 19 〉	통과 (24.90ms, 57.6MB)
테스트 20 〉	통과 (21.76ms, 57.1MB)
```