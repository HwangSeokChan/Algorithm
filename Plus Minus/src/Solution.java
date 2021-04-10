import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        
        List<Integer> temp = new ArrayList<Integer>(Arrays.stream(arr)
            .filter(i -> i!=0).boxed()
            .collect(Collectors.partitioningBy(i -> i > 0, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)))
            .values());

        float plus = Math.round((temp.get(1) / (float)arr.length) * 1000000) / 1000000.0f;
        float minus = Math.round((temp.get(0) / (float)arr.length) * 1000000) / 1000000.0f;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(1-(plus+minus));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
