class Solution {

    public int solutionA(int[] numbers, int target) {
        int sum = 0;

        for (int i : numbers) sum += i;

        if ((sum - target) % 2 != 0 ) return 0;

        return search(numbers, (sum - target) / 2, 0);
    }

    private int search(int[] numbers, int diff, int str) {
        int count = 0;
        for (int i = str; i < numbers.length; i++) {
            if (diff == numbers[i]) {
                count++;
            } else if (diff > numbers[i]) {
                count += search(numbers, diff - numbers[i], i+1);
            }
        }
        return count;
    }

    public int solutionB(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int sum, int idx) {
        int plus, minus, next;

        if(idx == numbers.length) {
            return (sum == target) ? 1 : 0;
        }

        plus  = sum + numbers[idx];
        minus = sum - numbers[idx];
        next  = idx + 1;

        return dfs(numbers, target, plus, next) 
            + dfs(numbers, target, minus, next);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Solution foo = new Solution();
        int[] numbers = {1, 2, 2, 2, 1, 1, 1, 1};
        numbers = new int[] {1, 1, 1, 1, 1};
        int target = 5;
        target = 3;
        // int a = foo.solutionA(numbers, target);
        // System.out.println(a);
        int b = foo.solutionB(numbers, target);
        System.out.println(b);
    }
}
