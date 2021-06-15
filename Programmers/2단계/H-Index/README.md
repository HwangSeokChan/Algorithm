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

### H-Index 정의
> - 연구성과 평가에서 총 `인용 수`와 발표 `논문 수` 두가지를 고려한 `양 + 질` 평가관계
> - 자신이 저널에 등재한 전체 논문중 많이 `인용된 순으로 정렬`한 후, 피인용수가 논문수와 같아지거나 피인용수가 논문수보다 작아지기 시작하는 숫자가 바로 나의 h가 됩니다. 다시 말하여, 이 연구원은 `논문 인용횟수가 h이 넘는 논문이 적어도 h편이 된다는 것을 의미`합니다. [BRIC 기사인용](https://www.ibric.org/myboard/read.php?Board=news&id=270333)

```bash

citations.sort().reverse();

$H = 0
for No in {0 ... Length}
do
    $least = Math.min(citations[No], No)
    if $H < $least then
        $H = $least
    else
        $result = $H
    fi
done

------------------------------------

정확성  테스트
테스트 1 〉	통과 (0.97ms, 52.2MB)
테스트 2 〉	통과 (2.47ms, 52.4MB)
테스트 3 〉	통과 (0.83ms, 53.5MB)
테스트 4 〉	통과 (0.98ms, 52.9MB)
테스트 5 〉	통과 (0.74ms, 53.4MB)
테스트 6 〉	통과 (0.90ms, 53.4MB)
테스트 7 〉	통과 (0.59ms, 52MB)
테스트 8 〉	통과 (0.46ms, 52.4MB)
테스트 9 〉	통과 (0.50ms, 53.2MB)
테스트 10 〉	통과 (0.73ms, 52.8MB)
테스트 11 〉	통과 (0.89ms, 53.2MB)
테스트 12 〉	통과 (0.53ms, 52.2MB)
테스트 13 〉	통과 (0.78ms, 53.3MB)
테스트 14 〉	통과 (0.90ms, 52.6MB)
테스트 15 〉	통과 (0.88ms, 52.6MB)
테스트 16 〉	통과 (0.50ms, 56.1MB)
```