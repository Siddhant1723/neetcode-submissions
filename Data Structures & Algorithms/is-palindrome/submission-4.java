class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int right=s.length()-1;
        if(s.length()==1)
            return true;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right))
            return false;
            left++;
            right--;
        }
        return true;
    }
}
