/* LeetCode 1768 Merge Strings Alternately */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1 = 0;
        int p2 = 0;
        String result = "";
        while (p1 < word1.length() && p2 < word2.length()) {
            result += word1.substring(p1, p1+1);
            result += word2.substring(p2, p2+1);
            p1++;
            p2++;
        }

        if (p1 < word1.length()) {
            result += word1.substring(p1);
        }

        if (p2 < word2.length()) {
            result += word2.substring(p2);
        }

        return result;
    }
}
