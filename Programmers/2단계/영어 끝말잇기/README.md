[영어 끝말잇기](https://programmers.co.kr/learn/courses/30/lessons/12981)

### 문제에 대한 생각
>   - 이전 값 비교 ( Memory )
>   - 중복 배제 ( Hash )
>   - 자료구조 선택
>       - `Stack` vs `Hash`
>           - `Stack.contain()`
>               - ~~O(n)~~
>           - `HashSet.add()`
>               - __O(1)__

- __Psuedo code__
```bash
1. Stack

for word in words
do
    if stack.not_empty() then
        if stack.contains(word) || stack.peek().lastChar() != word.firstChar() then
            $no = stack.size() % member + 1
            $loop = stack.size() / member + 1
            break;
        fi
    fi
    stack.push(word)
done

------------------------------------
정확성  테스트
테스트 1 〉	통과 (0.11ms, 52.2MB)
테스트 2 〉	통과 (0.21ms, 53.1MB)
테스트 3 〉	통과 (0.18ms, 52.4MB)
테스트 4 〉	통과 (0.23ms, 51.8MB)
테스트 5 〉	통과 (0.28ms, 52.2MB)
테스트 6 〉	통과 (0.13ms, 52.8MB)
테스트 7 〉	통과 (0.18ms, 53.1MB)
테스트 8 〉	통과 (0.15ms, 53.2MB)
테스트 9 〉	통과 (0.18ms, 52.6MB)
테스트 10 〉	통과 (0.29ms, 52.8MB)
테스트 11 〉	통과 (0.25ms, 52.1MB)
테스트 12 〉	통과 (0.18ms, 52.5MB)
테스트 13 〉	통과 (2.01ms, 52.9MB)
테스트 14 〉	통과 (0.16ms, 52.5MB)
테스트 15 〉	통과 (0.16ms, 52.9MB)
테스트 16 〉	통과 (0.16ms, 52.9MB)
테스트 17 〉	통과 (0.17ms, 52.2MB)
테스트 18 〉	통과 (0.16ms, 51.9MB)
테스트 19 〉	통과 (0.18ms, 52.3MB)
테스트 20 〉	통과 (0.59ms, 53MB)
```
```bash
2. HashSet

set.add(words[0])
$check = words[0].lastChar()

for i in {1 ... words.length}
do
    if hash.add(words[i]) && $check == words[i].firstChar() then
        $check = words[i].lastChar()
    else
        $no = i % member + 1
        $loop = i / member + 1
        break;
    fi
done

------------------------------------
정확성  테스트
테스트 1 〉	통과 (0.03ms, 52.2MB)
테스트 2 〉	통과 (0.04ms, 53.9MB)
테스트 3 〉	통과 (0.05ms, 53.7MB)
테스트 4 〉	통과 (0.06ms, 53.2MB)
테스트 5 〉	통과 (0.05ms, 52.2MB)
테스트 6 〉	통과 (0.03ms, 52.2MB)
테스트 7 〉	통과 (0.04ms, 52.9MB)
테스트 8 〉	통과 (0.04ms, 53.3MB)
테스트 9 〉	통과 (0.06ms, 52.8MB)
테스트 10 〉	통과 (0.07ms, 52.9MB)
테스트 11 〉	통과 (0.06ms, 53.4MB)
테스트 12 〉	통과 (0.04ms, 53MB)
테스트 13 〉	통과 (0.03ms, 53.4MB)
테스트 14 〉	통과 (0.05ms, 52.3MB)
테스트 15 〉	통과 (0.03ms, 52.8MB)
테스트 16 〉	통과 (0.03ms, 51.9MB)
테스트 17 〉	통과 (0.04ms, 52.3MB)
테스트 18 〉	통과 (0.03ms, 52.7MB)
테스트 19 〉	통과 (0.04ms, 53.1MB)
테스트 20 〉	통과 (0.07ms, 53MB)
```