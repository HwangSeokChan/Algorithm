[구명보트](https://programmers.co.kr/learn/courses/30/lessons/42885)

### 문제에 대한 생각
> - 제한사항
>   - 최대 2명
>   - 수용무게
> - 접근방법
>   - 가장 무거운 사람 + 가장 가벼운 사람
>   - 무게순 정렬
>   - Deque 를 사용한 매칭 ( 정렬을 통해 `극단차이`끼리 매칭)
>   - Stack 을 사용한 매칭 ( 정렬을 통해 `근접무게`부터 매칭)
- psuedo code

```bash
- Stack

for wegiht in {high ... low}
    if stack.not_empty && stack.peek >= wegiht then
        stack.pop() # 2인용 => 출발
        $count++;
    else
        stack.add($limit - weight)
    fi
done

정확성  테스트
테스트 1 〉	통과 (5.46ms, 53.1MB)
테스트 2 〉	통과 (2.88ms, 52.9MB)
테스트 3 〉	통과 (3.75ms, 53.3MB)
테스트 4 〉	통과 (4.43ms, 52.6MB)
테스트 5 〉	통과 (2.37ms, 52.8MB)
테스트 6 〉	통과 (1.52ms, 53MB)
테스트 7 〉	통과 (2.30ms, 53.1MB)
테스트 8 〉	통과 (0.76ms, 52.7MB)
테스트 9 〉	통과 (1.02ms, 52.7MB)
테스트 10 〉	통과 (3.65ms, 52.9MB)
테스트 11 〉	통과 (3.92ms, 53MB)
테스트 12 〉	통과 (3.09ms, 52.9MB)
테스트 13 〉	통과 (3.13ms, 52.4MB)
테스트 14 〉	통과 (3.93ms, 53.1MB)
테스트 15 〉	통과 (1.03ms, 52.1MB)
효율성  테스트
테스트 1 〉	통과 (20.25ms, 56.6MB)
테스트 2 〉	통과 (19.47ms, 54.6MB)
테스트 3 〉	통과 (21.44ms, 55.5MB)
테스트 4 〉	통과 (18.70ms, 54.5MB)
테스트 5 〉	통과 (18.18ms, 54.6MB)
```