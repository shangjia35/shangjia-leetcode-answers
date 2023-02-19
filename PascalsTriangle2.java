/* LeetCode 119 Pascal's Triangle II */

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);

        for (int i = 1; i <= rowIndex; i++) {
             List<Integer> thisRow = new ArrayList<>();

             thisRow.add(1);
             for (int j = 0; j < prevRow.size() - 1; j++) {
                 thisRow.add(prevRow.get(j) + prevRow.get(j+1));
             }
             thisRow.add(1);

             prevRow = thisRow;
        }

        return prevRow;
    }
}
