class Solution {
    public int solution(int[] citations) {
        for (int i = citations.length; i > 0; i--) {
            int above = 0;
            int below = 0;
            for (int citation : citations) {
                if (citation == i) {
                    above ++;
                    below ++;
                } else if (citation > i) {
                    above ++;
                } else if (citation < i) {
                    below ++;
                }
            }

            if (above >= i && below <= i) {
                return i;
            }
        }

        return 0;
    }
}