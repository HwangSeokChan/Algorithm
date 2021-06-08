class Solution {
    public String solution(String m, String[] musicinfos) {

        int songTime = 0;
        String songTitle = "(None)";

        m = substitution(m);
        for (String musicinfo : musicinfos) {
            String[] info = musicinfo.split(",");
            String str = info[0];
            String end = info[1];
            String title = info[2];
            String melody = substitution(info[3]);

            int playMinute = playMinute(str, end);
            String playMelody = playMelody(melody, playMinute);

            if (playMelody.contains(m) && playMinute > songTime) {
                songTitle = title;
                songTime = playMinute;
            }
        }

        return songTitle;
    }

    private String substitution(String melody) {
        return melody.replaceAll("C#", "0")
                     .replaceAll("D#", "1")
                     .replaceAll("F#", "2")
                     .replaceAll("G#", "3")
                     .replaceAll("A#", "4");
    }
    
    private int playMinute(String str, String end) {
        return convertTimeFormat(end) - convertTimeFormat(str);
    }

    private int convertTimeFormat(String time) {
        
        int hour = Integer.valueOf(time.substring(0, 2));
        int minute = Integer.valueOf(time.substring(3, 5));

        return (hour * 60) + minute;
    }

    private String playMelody(String melody, int minute) {

        char[] m = melody.toCharArray();
        StringBuilder playMelody = new StringBuilder();
        for (int i = 0; i < minute; i++) {
            playMelody.append(m[i % m.length]);
        }

        return playMelody.toString();
    }
}