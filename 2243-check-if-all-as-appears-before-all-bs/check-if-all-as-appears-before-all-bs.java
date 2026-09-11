class Solution {
    public boolean checkString(String s) {
        boolean mark = false;
        for(char c : s.toCharArray()){
            if(c == 'b'){
                mark = true;
            }

            if(mark && c == 'a') return false;
        }
        return true;
    }
}