class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0;
        int length=0;
        int globallength=0;
        for(int i=0;i<s.length();i++){
            
            if(set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))&&left<=i){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            length=i-left+1;
            set.add(s.charAt(i));
            globallength=Math.max(length,globallength);
        }
        return globallength;
    }
}
