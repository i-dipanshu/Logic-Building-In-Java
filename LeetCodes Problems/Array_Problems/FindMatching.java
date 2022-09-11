// https://leetcode.com/problems/count-items-matching-a-rule/submissions/
package Array_Problems;

import java.util.ArrayList;

public class FindMatching {
    public int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
                count++;
            }
            if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
                count++;
            }
            if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
