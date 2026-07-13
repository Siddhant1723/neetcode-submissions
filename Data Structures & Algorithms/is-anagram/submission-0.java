class Solution {
    public boolean isAnagram(String s, String t) {
        int[] chars=new int[26];
        if(s.length() != t.length())
            return false;
        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'a']++;
            chars[t.charAt(i)-'a']--;
        }
        int c=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=0)
               c++; 
        }
        if(c==0)
            return true;
        else
            return false;
    }
}
