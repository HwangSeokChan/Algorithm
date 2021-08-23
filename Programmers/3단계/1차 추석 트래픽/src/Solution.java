import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
    public int solution(String[] lines) {

        long[] strTimes = new long[lines.length];
        long[] endTimes = new long[lines.length];

        
        for (int i = 0; i < lines.length; i++) {
            long[] times = getMillis(lines[i]);
            strTimes[i] = times[0];
            endTimes[i] = times[1];
        }

        return countThroughput(strTimes, endTimes);
    }

    private long[] getMillis(String line) {

        String[] temp = line.split(" ");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = null;
        try {
            date = format.parse(temp[0] + " " + temp[1]);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long duration = (long) (Float.parseFloat(temp[2].substring(0, temp[2].length()-1)) * 1000) - 1;
        long endTime = date.getTime();
        long strTime = endTime - duration;

        return new long[] {strTime, endTime};
    }

    private int countThroughput(long[] strTimes, long[] endTimes) {

        int max = 0;
        int loop = strTimes.length;

        for (int i = 0; i < loop; i++) {
            int left = 0;
            long leftStr = strTimes[i] - (1000 - 1);
            long leftEnd = strTimes[i];
            for (int j = 0; j < loop; j++) {

                if (!(endTimes[j] < leftStr) && !(leftEnd < strTimes[j])) {
                    left++;
                }

            }

            int right = 0;
            long rightStr = endTimes[i];
            long rightEnd = endTimes[i] + (1000 - 1);
            for (int j = 0; j < loop; j++) {
                if (!(endTimes[j] < rightStr) && !(rightEnd < strTimes[j])) {
                    right++;
                }
            }

            max = Math.max(max, Math.max(left, right));
        }

        return max;
    }
}