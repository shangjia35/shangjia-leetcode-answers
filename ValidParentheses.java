/* 20. Valid Parentheses */
// stack

class Solution {
    public boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int arrIdx = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                arr[arrIdx++] = ch;
            } else {
                if (arrIdx <= 0) {
                    return false;
                }
                
                char topch = arr[arrIdx - 1];
                if ((topch == '(' && ch != ')') || 
                (topch == '{' && ch != '}') || 
                (topch == '[' && ch != ']')) {
                    return false;
                } else {
                    arrIdx--;
                }
            }
        }
        
        if (arrIdx != 0) {
            return false;
        }

        return true;
    }
}
