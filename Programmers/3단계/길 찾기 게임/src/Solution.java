import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import lombok.Data;

class Solution {
    public int[][] solution(int[][] nodeinfo) {

        int[][] answer = new int[2][nodeinfo.length];
        
        Comparator<int[]> comparator = (s1, s2)-> {
            int y = Integer.compare(s2[1], s1[1]);
            int x = Integer.compare(s2[0], s1[0]);
            return (y != 0) ? y : x;
        };

        Map<int[], Integer> map = new TreeMap<int[], Integer>(comparator);
        for (int i = 0; i < nodeinfo.length; i++) {
            map.put(nodeinfo[i], i+1);
        }

        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        for (int[] k : map.keySet()) {
            tree.insert(k[0], k[1], map.get(k));
        }

        List<Integer> preList = new ArrayList<Integer>();
        List<Integer> postList = new ArrayList<Integer>();

        tree.preorder(preList);
        tree.postorder(postList);

        answer[0] = preList.stream().mapToInt(Integer::intValue).toArray();
        answer[1] = postList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }


}

class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> insert(T x, T y, T v) {

        if (root == null) {
            root = new Node<T>(x, y, v);
            return root;
        }
        return root.insert(root, x, y, v);
    }

    public void preorder(List<T> list) {
        if (root != null) {
            list.add(root.getV());
            preorder(list, root.getLeft());
            preorder(list, root.getRight());
        } else {
            throw new NullPointerException("Root is Null");
        }
    }

    public void preorder(List<T> list, Node<T> node) {
        if (node != null) {
            list.add(node.getV());
            preorder(list, node.getLeft());
            preorder(list, node.getRight());
        }
    }

    public void postorder(List<T> list) {
        if (root != null) {
            postorder(list, root.getLeft());
            postorder(list, root.getRight());
            list.add(root.getV());
        } else {
            throw new NullPointerException("Root is Null");
        }
    }

    public void postorder(List<T> list, Node<T> node) {
        if (node != null) {
            postorder(list, node.getLeft());
            postorder(list, node.getRight());
            list.add(node.getV());
        }
    }



    /**
     * Inner Class Node
     */
    @Data
    class Node<T extends Comparable<T>> {
        private T x;
        private T y;
        private T v;
        private Node<T> left;
        private Node<T> right;
        public Node(T x, T y, T v) {
            this.x = x;
            this.y = y;
            this.v = v;
        }

        public Node<T> insert(Node<T> node, T x, T y, T v) {
            if (node == null) return new Node<T>(x, y, v);
            if (node.getX().compareTo(x) > 0) {
                node.setLeft(insert(node.getLeft(), x, y, v));
            } else {
                node.setRight(insert(node.getRight(), x, y, v));
            }
            return node;
        }
    };
}