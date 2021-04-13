[K번째수](https://programmers.co.kr/learn/courses/30/lessons/42748)


### 문제에 대한 생각
- Array 메소드에 지정된 Parameter의 Index or Ordinal 여부
    - 대상에 따른 OutOfIndex 유의
- Arrays.strem(a).sorted() vs Arrays.sort(a) 의 Return 차이
- IntStream => Array 변환
    - Int [ ]
        - Arrays.strem(a).toArray();
    - Integer [ ]
        - Arrays.strem(a).boxed().toArray(Integer[]::new);