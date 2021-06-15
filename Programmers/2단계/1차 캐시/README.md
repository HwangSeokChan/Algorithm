# [1차 캐시](https://programmers.co.kr/learn/courses/30/lessons/17680)

## 문제에 대한 생각

> - cache 사용 여부
> - cache 초과 여부
> - cache 검색 여부

### List Cache

```bash
if cacheSize == 0 then
    return QUEUE.size() * 'MISS'
fi

for city in cities
do
    city.toCase()
    if cache.contains() then
        time += 'HIT'
        cache.remove(city) # Re-Sort (1)
    else
        time += 'MISS'
        if cache.size() == cacheSize then # LRU
            cache.removeFirst()
        fi
    fi
    cache.add(city); # Re-Sort (2)
done

정확성  테스트
테스트 1 〉	통과 (0.07ms, 52.4MB)
테스트 2 〉	통과 (0.07ms, 52.6MB)
테스트 3 〉	통과 (0.08ms, 52.2MB)
테스트 4 〉	통과 (0.07ms, 52.8MB)
테스트 5 〉	통과 (0.06ms, 52.5MB)
테스트 6 〉	통과 (0.02ms, 52.2MB)
테스트 7 〉	통과 (0.02ms, 52MB)
테스트 8 〉	통과 (0.13ms, 53MB)
테스트 9 〉	통과 (0.07ms, 52.5MB)
테스트 10 〉	통과 (0.34ms, 53.3MB)
테스트 11 〉	통과 (59.59ms, 80.1MB)
테스트 12 〉	통과 (0.31ms, 52.2MB)
테스트 13 〉	통과 (0.64ms, 53.5MB)
테스트 14 〉	통과 (0.96ms, 53.2MB)
테스트 15 〉	통과 (1.33ms, 52.9MB)
테스트 16 〉	통과 (1.57ms, 54.5MB)
테스트 17 〉	통과 (0.05ms, 53.6MB)
테스트 18 〉	통과 (3.60ms, 53.6MB)
테스트 19 〉	통과 (3.87ms, 53.1MB)
테스트 20 〉	통과 (4.40ms, 52.9MB)
```