class Solution {
    public String solution(String s) {
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                isFirst = true;
            } else {
                if (isFirst) {
                    c = toUpperCase(c);
                    isFirst = false;
                } else {
                    c = toLowerCase(c);
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    private char toUpperCase(char c) {
        return (c >= 'a' && c <= 'z') ? (char) (c - 32) : c;
    }

    private char toLowerCase(char c) {
        return (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c;
    }
}