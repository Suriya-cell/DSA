class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sb = "";
        String sb1 = "";

        for(String s : word1){
            sb = sb + s;
        }
        for(String s : word2){
            sb1 = sb1 + s;
        }

        return sb.equals(sb1);

    }
}