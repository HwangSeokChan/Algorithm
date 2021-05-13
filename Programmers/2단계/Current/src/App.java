public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(foo.bfs(maps));
    }
}
