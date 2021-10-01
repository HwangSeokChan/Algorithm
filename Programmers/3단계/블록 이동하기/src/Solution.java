import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public int solution(int[][] board) {
        Robot robot = new Robot(board);
        return robot.search();
    }
}

class Node {
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    
    public Node (int x1, int y1, int x2, int y2) {
        if (x2 > x1) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else if (x2 < x1) {
            this.x1 = x2;
            this.y1 = y2;
            this.x2 = x1;
            this.y2 = y1;
        } else if (y2 > y1) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            this.x1 = x2;
            this.y1 = y2;
            this.x2 = x1;
            this.y2 = y1;
        }
    }

    public int max() {
        return Arrays.stream(new int[] {x1, x2, y1, y2})
                    .max()
                    .orElseThrow(NoSuchElementException::new);
    }

    public int min() {
        return Arrays.stream(new int[] {x1, x2, y1, y2})
                    .min()
                    .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public boolean equals(Object obj) {
        // return this.hashCode() == obj.hashCode();
        return ( this.x1 == ((Node) obj).x1
            && this.x2 == ((Node) obj).x2
            && this.y1 == ((Node) obj).y1
            && this.y2 == ((Node) obj).y2
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }
}

class Robot {
    
    private int[][] graph;

    private final int[][] move_directions = {{1,0}, {0,1},{-1,0}, {0,-1}};
    private final char[] rotate_coordinates = {'l', 'r'};
    private final int[] rotate_directions = {-1, 1};
    private final Predicate<Node> existIndex = node -> ! (node.min() < 0 || node.max() >= graph.length);
    private final Predicate<Node> isRoute = node -> ! (graph[node.y1][node.x1] == 1 || graph[node.y2][node.x2] == 1);
    private final int STANDARD_TIME = 1;

    public Robot (int[][] graph) {
        this.graph = graph;
    }

    public int search() {
        Queue<Node> queue = new LinkedList<Node>();
        Map<Node, Integer> times = new HashMap<Node, Integer>();
        Node strNode = new Node(0,0,1,0);
        return bfs(queue, times, strNode);
    }

    private int bfs(Queue<Node> queue, Map<Node, Integer> times, Node node) {

        queue.add(node);
        times.put(node, 0);
        
        while (! queue.isEmpty()) {
            node = queue.poll();
            Set<Node> set = getLinkedNode(node);
            Iterator<Node> it = set.iterator();
            while (it.hasNext()) {
                Node linkedNode = it.next();
                if (! times.containsKey(linkedNode)) {
                    times.put(linkedNode, times.get(node) + STANDARD_TIME);
                    if (isGoal(linkedNode)) {
                        return times.get(linkedNode);
                    }
                    queue.add(linkedNode);
                }
            }
        }

        return -1;
    }

    private boolean isGoal(Node node) {
        if ((node.x1 == graph.length-1 && node.y1 == graph.length-1)
         || (node.x2 == graph.length-1 && node.y2 == graph.length-1)) {
            return true;
        }

        return false;
    }

    private Set<Node> getLinkedNode(Node node) {
        Set<Node> set = new HashSet<Node>();
        Stream.of(move(node), rotate(node)).forEach(set::addAll);
        return set;
    }

    private Set<Node> move(Node node) {
        return Arrays.stream(move_directions)
                    .map(d -> new Node(node.x1+d[0], node.y1+d[1], node.x2+d[0], node.y2+d[1]))
                    .filter(existIndex.and(isRoute)).collect(Collectors.toSet());
    }

    private Set<Node> rotate(Node node) {
        Set<Node> set = new HashSet<Node>();

        char axis = (node.y1 == node.y2) ? 'x' : 'y';
        for (char coordinate : rotate_coordinates) {
            for (int direction : rotate_directions) {

                int check_x;
                int check_y;
                int axis_x;
                int axis_y;
                int rotated_x;
                int rotated_y;

                switch (coordinate) {
                    case 'l':
                        check_x = node.x1;
                        check_y = node.y1;
                        axis_x = node.x2;
                        axis_y = node.y2;
                        break;
                    case 'r':
                        axis_x = node.x1;
                        axis_y = node.y1;
                        check_x = node.x2;
                        check_y = node.y2;
                        break;
                    default : throw new RuntimeException();
                }

                switch (axis) {
                    case 'x': 
                        check_y += direction;
                        rotated_x = axis_x;
                        rotated_y = check_y;
                        break;
                    case 'y': 
                        check_x += direction;
                        rotated_x = check_x;
                        rotated_y = axis_y;
                        break;
                    default : throw new RuntimeException();
                }

                if (existIndex.and(isRoute).test(new Node(check_x, check_y, axis_x, axis_y)) 
                    && isRoute.test(new Node(rotated_x, rotated_y, axis_x, axis_y))) {
                    set.add(new Node(rotated_x, rotated_y, axis_x, axis_y));
                }
            }
        }

        return set;
    }
}
