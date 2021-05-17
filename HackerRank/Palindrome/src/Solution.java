import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int c = (int)a.stream().count();
        System.out.println(c);
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        /* OS Env Setting
            ## Set
                # Windows CMD
                    C:\> set VAR_NAME="VALUE"
                # Windows PowerShell
                    PS C:\> $env:VAR_NAME="VALUE"
            ## Check
                # Windows CMD
                    C:\> echo %VAR_NAME%
                # Windows PowerShell
                    PS C:\> $env:VAR_NAME
            ## Reopen IDE to recognize new env
            ## VSCode Set Var into launch.json
            "env": {
                "OUTPUT_PATH": "C:\\Users\\Public"
            }
        */

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
