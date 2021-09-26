import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int solution(String word, String[] pages) {
        double[] allScore = new double[pages.length];
        double[] standardScore = new double[pages.length];
        String[] urls = new String[pages.length];
        String[][] anchors = new String[pages.length][];
        Pattern wordPattern = Pattern.compile("(?<=[^a-z]|^)("+word.toLowerCase()+")(?=[^a-z])");
        Pattern urlPattern = Pattern.compile("(?<=<meta\\sproperty=\"og:url\"\\scontent=\"https://)(\\S+)(?=\")");
        Pattern anchorPattern = Pattern.compile("(?<=<a href=\"https://)(\\S+)(?=\")");
        
        for (int i = 0; i < pages.length; i++) {
            Matcher wordMatcher = wordPattern.matcher(pages[i].toLowerCase());
            Matcher urlMatcher = urlPattern.matcher(pages[i].toLowerCase());
            Matcher anchorMatcher = anchorPattern.matcher(pages[i].toLowerCase());
            List<String> anchor = new ArrayList<String>();
            while (wordMatcher.find()) standardScore[i]++;
            while (urlMatcher.find()) urls[i] = urlMatcher.group();
            while (anchorMatcher.find()) anchor.add(anchorMatcher.group());
            anchors[i] = anchor.toArray(String[]::new);
        }

        for (int i = 0; i < pages.length; i++) {
            allScore[i] = standardScore[i];
            for (int j = 0; j < pages.length; j++) {
                if (i == j) continue;
                for (int j2 = 0; j2 < anchors[j].length; j2++) {
                    if (urls[i].equals(anchors[j][j2])) {
                        allScore[i] += (standardScore[j] / anchors[j].length);
                        break;
                    }
                }
            }
        }

        double max = allScore[0];
        int maxIdx = 0;
        for (int i = 1; i < allScore.length; i++) {
            if (Double.compare(allScore[i], max) > 0 ) {
                max = allScore[i];
                maxIdx = i;
            }
        }
        
        return maxIdx;
    }
}