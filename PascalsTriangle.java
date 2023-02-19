/* LeetCode 118 Pascal's Triangle */
/* Intuitive Approach */
class Solution {
    /* Do calculations based on the previous row */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        ans.add(row1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> tempRow = ans.get(i-1);
            List<Integer> rowi = new ArrayList<>();

            rowi.add(1);
            for (int j = 0; j < tempRow.size() - 1; j++) {
                rowi.add(tempRow.get(j) + tempRow.get(j+1));
            }
            rowi.add(1);

            ans.add(rowi);
        }

        return ans;
    }
}
