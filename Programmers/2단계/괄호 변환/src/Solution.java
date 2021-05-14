class Solution {
    public String solution(String p) {
        return (p.length() > 0) ? getRightBracket(p) : "";
    }

    private String getRightBracket(String p) {
        int l=0, r=0;

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') l += 1; else r += 1;

            if (l == r) {
                String f = p.substring(0, i+1);
                String b = p.substring(i+1);
                int isRight = 0;
                // 올바른 괄호 여부 판단
                for (int j = 0; j < f.length(); j++) {
                    isRight += f.charAt(j) == '(' ? 1 : -1;
                    if (isRight < 0) {
                        break;
                    }
                }

                if (isRight < 0) {
                    char[] ca = f.toCharArray();
                    String tmp = "";
                    for (int j = 1; j < ca.length-1; j++) {
                        tmp += (ca[j] == '(') ? ")" : "(" ;
                    }
                    p = "(" + getRightBracket(b) + ")" + tmp;
                } else {
                    p = (b.length() == 0) ? (f + b) : (f + getRightBracket(b));
                }

                break;
            }
        }
        return p;
    }

    private String adjustBracket(String f) {
        char[] ca = f.toCharArray();
        String tmp = "";
        for (int i = 1; i < ca.length-1; i++) {
            tmp += (ca[i] == '(') ? ")" : "(" ;
        }
        return "(" + tmp + ")";
    }
}