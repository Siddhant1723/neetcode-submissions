class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int freq[]=new int[26];
        int maxfreq=0;
        int i=0;
        for(i=0;i<s.length();i++){
        freq[s.charAt(i)-'A']++;
        maxfreq=Math.max(freq[s.charAt(i)-'A'],maxfreq);
        while(i-left-maxfreq+1>k&&left<=i){
        freq[s.charAt(left)-'A']--;
        left++;
        }
       }
       return (i-left); 
    }
}
