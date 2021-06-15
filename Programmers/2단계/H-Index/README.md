# [H-Index](https://programmers.co.kr/learn/courses/30/lessons/42747)

## 문제에 대한 생각

> - H 개 이상인 갯수가 `H 개 이상`
> - H 개 이하인 갯수가 `H 개 이하`

### Count From Max
```bash
for H in {Max ... 1}
do

    for citation in citations
    do
        if citation == H then count.$both
        else if citation > H then count.$above
        else if citation < H then count.$bellow
    done

    if (H >= $above && H <= $bellow) then
        $result = H;
    if
done

$result = 0;

------------------------------------

정확성  테스트
테스트 1 〉	통과 (0.53ms, 53.2MB)
테스트 2 〉	통과 (2.20ms, 51.9MB)
테스트 3 〉	통과 (1.06ms, 51.9MB)
테스트 4 〉	통과 (0.91ms, 53.9MB)
테스트 5 〉	통과 (1.85ms, 53.8MB)
테스트 6 〉	통과 (2.30ms, 52.7MB)
테스트 7 〉	통과 (0.19ms, 52.3MB)
테스트 8 〉	통과 (0.02ms, 52.3MB)
테스트 9 〉	통과 (0.02ms, 52.4MB)
테스트 10 〉	통과 (0.29ms, 52.2MB)
테스트 11 〉	통과 (3.25ms, 52.3MB)
테스트 12 〉	통과 (0.03ms, 53.2MB)
테스트 13 〉	통과 (1.77ms, 52.1MB)
테스트 14 〉	통과 (1.43ms, 53.4MB)
테스트 15 〉	통과 (1.60ms, 55.3MB)
테스트 16 〉	통과 (0.03ms, 51.9MB)
```