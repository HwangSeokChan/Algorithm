[길 찾기 게임](https://programmers.co.kr/learn/courses/30/lessons/42892)

### 문제에 대한 생각

#### 문제의 조건

1. 이진탐색트리
   1. 임의의 노드 V의 왼쪽 서브 트리(left subtree)에 있는 모든 노드의 x값은 V의 x값보다 작다.
   2. 임의의 노드 V의 오른쪽 서브 트리(right subtree)에 있는 모든 노드의 x값은 V의 x값보다 크다.
2. 정렬
   1. 같은 레벨(level)에 있는 노드는 같은 y 좌표를 가진다.
   2. 자식 노드의 y 값은 항상 부모 노드보다 작다.
3. 중복입력 없음
   1. 모든 노드는 서로 다른 x값을 가진다.

#### 풀이

1. 이진탐색트리

```java

// Tree 구조
private Node<T> root;
public void preorder(List<T> list);
public void postorder(List<T> list);

// Node 구조
@Data
private T x;
private T y;
private T v;
private Node<T> left;
private Node<T> right;

// 입력 - Tree 시작
public Node<T> insert(T x, T y, T v) {

   if (root == null) {
      root = new Node<T>(x, y, v);
      return root;
   }
   return root.insert(root, x, y, v);
}

// 입력 - Node Recursive
public Node<T> insert(Node<T> node, T x, T y, T v) {
   if (node == null) return new Node<T>(x, y, v);
   if (node.getX().compareTo(x) > 0) {
         node.setLeft(insert(node.getLeft(), x, y, v));
   } else {
         node.setRight(insert(node.getRight(), x, y, v));
   }
   return node;
}

//

```
2. 정렬 - Y 정렬 및 중복시 Key 분별을 위해 X 정렬 - `X 는 중복입력 없음`
```java
Comparator<int[]> comparator = (s1, s2)-> {
   int y = Integer.compare(s2[1], s1[1]);
   int x = Integer.compare(s2[0], s1[0]);
   return (y != 0) ? y : x;
};
```

### 결과

```정확성  테스트
테스트 1 〉	통과 (3.32ms, 77.1MB)
테스트 2 〉	통과 (3.85ms, 77.8MB)
테스트 3 〉	통과 (4.61ms, 74.8MB)
테스트 4 〉	통과 (3.91ms, 71.9MB)
테스트 5 〉	통과 (3.91ms, 94.6MB)
테스트 6 〉	통과 (19.33ms, 82.8MB)
테스트 7 〉	통과 (17.91ms, 81.2MB)
테스트 8 〉	통과 (30.20ms, 86.7MB)
테스트 9 〉	통과 (61.31ms, 95.7MB)
테스트 10 〉	통과 (16.81ms, 83.8MB)
테스트 11 〉	통과 (85.64ms, 99MB)
테스트 12 〉	통과 (60.68ms, 92.6MB)
테스트 13 〉	통과 (6.54ms, 93.3MB)
테스트 14 〉	통과 (8.65ms, 70.6MB)
테스트 15 〉	통과 (29.29ms, 82.8MB)
테스트 16 〉	통과 (48.45ms, 110MB)
테스트 17 〉	통과 (10.85ms, 79.2MB)
테스트 18 〉	통과 (41.86ms, 112MB)
테스트 19 〉	통과 (13.32ms, 84.8MB)
테스트 20 〉	통과 (15.48ms, 99.2MB)
테스트 21 〉	통과 (26.74ms, 86.5MB)
테스트 22 〉	통과 (41.32ms, 113MB)
테스트 23 〉	통과 (32.56ms, 109MB)
테스트 24 〉	통과 (3.37ms, 91.9MB)
테스트 25 〉	통과 (4.22ms, 75.8MB)
테스트 26 〉	통과 (28.01ms, 86.5MB)
테스트 27 〉	통과 (3.70ms, 67.4MB)
테스트 28 〉	통과 (4.76ms, 80.1MB)
테스트 29 〉	통과 (3.83ms, 73.3MB)
```