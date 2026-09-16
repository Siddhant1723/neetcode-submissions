class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int globallength=0;
        int length=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))&&left<=i){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            length=i-left+1;
            globallength=Math.max(length,globallength);
        }
        return globallength;
    }
}
