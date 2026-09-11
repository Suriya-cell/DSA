class Solution {
    public int lengthOfLongestSubstring(String s) {
         int left = 0 ;
         int[] has = new int[256];
         int maxx = 0;
         Arrays.fill(has,-1);

         for(int right = 0 ; right < s.length() ; right++){
            if(has[s.charAt(right)] != -1){
                if(left <= has[s.charAt(right)])
                    left = has[s.charAt(right)] + 1;
            }
            maxx = Math.max(maxx , right - left + 1);
            has[s.charAt(right)] = right;
         }
         return maxx;

    }
}