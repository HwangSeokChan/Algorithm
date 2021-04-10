import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        String blank, symbol, line;
        int depth = 0;
        do {
            ++depth;
            blank = "\s".repeat(n-depth);
            symbol = "#".repeat(depth);
            line = blank.concat(symbol);

            System.out.println(line);
        } while (n > depth);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
