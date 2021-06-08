class Solution {
    public int solution(String skill, String[] skill_trees) {

        int count = 0;
        for (String skill_tree : skill_trees) {
            for (char c : skill_tree.toCharArray()) {
                // regex
                // skill_tree = skill_tree.replaceAll("[^"+skill+"]", "");
                if (skill.indexOf(c) == -1) {
                    skill_tree = skill_tree.replace(c+"", "");
                }      
            }
            if (skill.startsWith(skill_tree)) {
                count += 1;
            }
        }

        return count;
    }

    
    public int solutionB(String skill, String[] skill_trees) {
        int count = 0;
        int master = skill.length();
        for (String skill_tree : skill_trees) {
            int current = 0;
            boolean collect = true;
            for (char c : skill_tree.toCharArray()) {
                int tree_idx = skill.indexOf(c);
                // 조건 없는 스킬
                if (tree_idx == -1) {   
                    continue;
                }   

                // 순서가 틀릴 경우
                if (current != tree_idx) {
                    collect = false;
                    break;
                }

                // 마스터 했을 경우
                if (current == master) {
                    break;
                }

                current++;
            }
            if (collect) {
                count += 1;
            }
        }
        return count;
    }
}