import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        Waiting waiting = new Waiting(n, t, m, timetable);
        return waiting.lastTime().toString();
    }
}

/**
 * Bus
 */
class Waiting {

    private final static DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");

    private int[] waittimes;
    private int[] bustimes;
    private int[] seat;

    public Waiting(int n, int t, int m, String[] timetable) {
        this.waittimes = Stream.of(timetable)
                        .mapToInt(time -> LocalTime.parse(time, TIME_FORMAT).toSecondOfDay())
                        .sorted()
                        .toArray();
        this.bustimes = IntStream.range(0, n)
                        .map(i -> LocalTime.of(9, 0).plusMinutes(i*t).toSecondOfDay())
                        .toArray();
        this.seat = IntStream.generate(()-> m)
                        .limit(n)
                        .toArray();
    }

    public LocalTime lastTime() {

        int next = 0;
        for (int i = 0; i < bustimes.length; i++) {
            next = arrive(i, next);
        }

        if (seat[seat.length-1] == 0) {
            return LocalTime.ofSecondOfDay(waittimes[next-1] - 60);
        } else {
            return LocalTime.ofSecondOfDay(bustimes[bustimes.length-1]);
        }
    }

    public int arrive(int busNo, int next) {
        for (int i = next; i < waittimes.length; i++) {
            if (seat[busNo] == 0 || waittimes[i] > bustimes[busNo]) {
                break;
            } else {
                seat[busNo]--;
                next++;
            }
        }

        return next;
    }
}