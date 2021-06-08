class Solution {
    public int[] solution(String s) {

        int count = 0;
        int deleted = 0;
        while (! s.equals("1")) {
            
            int zero = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zero += 1;
                }
            }
            s = Integer.toBinaryString(s.length() - zero);
            deleted += zero;
            count += 1;
        }

        return new int[] {count, deleted};
    }
}