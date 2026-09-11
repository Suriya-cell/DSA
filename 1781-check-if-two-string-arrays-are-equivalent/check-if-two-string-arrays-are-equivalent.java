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

        System.out.println(sb);
        System.out.print(sb1);


        return sb.equals(sb1);

    }
}