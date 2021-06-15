import java.util.*;
import java.util.regex.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, new FileComparator());
        return files;
    }
}

/**
 * FileComparator
 */
class FileComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        
        Pattern pattern = Pattern.compile("(\\D{1,})|(\\d{1,})");
        Matcher matcherA = pattern.matcher(o1.toUpperCase());
        Matcher matcherB = pattern.matcher(o2.toUpperCase());

        int compared = 0;
        boolean isDigit = false;
        while (matcherA.find() && matcherB.find() && compared == 0) {
            if (isDigit) {
                return Integer.compare(Integer.parseInt(matcherA.group()), Integer.parseInt(matcherB.group()));
            } else {
                compared = matcherA.group().compareTo(matcherB.group());
            }
            isDigit ^= true;
        }

        return (compared != 0) ? compared : (matcherA.find()) ? -1 : (matcherB.find()) ? 1 : 0 ;
    }

    public int compareA(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int i = 0;
        int j = 0;
        while (i < s1.length() && !Character.isDigit(s1.charAt(i))) ++i;
        while (j < s2.length() && !Character.isDigit(s2.charAt(j))) ++j;

        int cmp1 = s1.substring(0, i).compareTo(s2.substring(0, j));
        if (cmp1 != 0) return cmp1;

        int startI = i;
        int startJ = j;
        while (i < s1.length() && Character.isDigit(s1.charAt(i))) ++i;
        while (j < s2.length() && Character.isDigit(s2.charAt(j))) ++j;

        return Integer.compare(
            Integer.parseInt(s1.substring(startI, i)), 
            Integer.parseInt(s2.substring(startJ, j))
        );
    }
}