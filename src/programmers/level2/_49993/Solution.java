package programmers.level2._49993;

/**
 * 스킬트리
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 * @author big
 *
 */
public class Solution {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		System.out.println(solution(skill, skill_trees));
	}
	
	public static int solution(String skill, String[] skill_trees) {
		int result = 0;
		boolean isAdd = true;
		String tempSkill = skill;
		for (int i = 0; i < skill_trees.length; i++) {
			String[] strArr = skill_trees[i].split("");
			tempSkill = skill;
			isAdd = true;
			for (int j = 0; j < strArr.length; j++) {
				String s = strArr[j];
				
				if (tempSkill.contains(s)) {
					if (tempSkill.indexOf(s) != 0) {
						isAdd = false;
						break;
					}
					tempSkill = tempSkill.substring(1);
				}
			}
			
			if (isAdd) {
				result++;
			}
		}
		
        return result;
    }
}
