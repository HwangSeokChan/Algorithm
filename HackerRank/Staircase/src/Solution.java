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
        // String version = System.getProperty("java.version");
        // System.out.println("JAVA Version : " + version);
        // ==> HackerRank Java Version : 1.8
        int depth = 0;
        do {
            ++depth;
            String line = "";
            for (int i = 0; i < n-depth; i++) {
                line += " ";
            }
            for (int i = 0; i < depth; i++) {
                line += "#";
            }
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
