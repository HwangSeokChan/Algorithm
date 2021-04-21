

class Solution {

    // 모든 대문자를 대응되는 소문자로 치환합니다.
    private String step1(String str) {
        return str.toLowerCase();
    }

    // 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    // 단, 입력가능 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/
    private String step2(String str) {
        return str.replaceAll("[~!@#$%^&*()=+\\[{\\]}:?,<>/]", "");
    }

    // 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    private String step3(String str) {
        return str.replaceAll("\\.{2,}", ".");
    }

    // 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    private String step4(String str) {
        return str.replaceAll("^\\.|\\.$", "");
        
    }

    // 빈 문자열이라면, new_id에 "a"를 대입합니다.
    private String step5(String str) {
        return (str.trim().length() == 0)? "a" : str;
        
    }

    // 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
    // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    private String step6(String str) {
        return (str.length() >= 16) ? this.step4(str.substring(0, 15)) : str;
        
    }

    // 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
    private String step7(String str) {
        return (str.length() <= 2) ? str + str.substring(str.length()-1).repeat(3 - str.length()) : str;
    }

    public String solution(String new_id) {
        String answer = "";
        new_id = this.step1(new_id);
        new_id = this.step2(new_id);
        new_id = this.step3(new_id);
        new_id = this.step4(new_id);
        new_id = this.step5(new_id);
        new_id = this.step6(new_id);
        answer = this.step7(new_id);
        return answer;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] new_ids = { "...!@BaT#*..y.abcdefghijklm", "z-+.^.", "=.=", "123_.def", "abcdefghijklmn.p" };

        Solution s = new Solution();
        for (String new_id : new_ids) {
            System.out.println(new_id + " => " + s.solution(new_id));
        }
    }
}
