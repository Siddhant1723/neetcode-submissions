class Solution {
    public int longestConsecutive(int[] nums) {
        int c=1;
        int c1=0;
        int flag=0;
        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]-1)){
            flag=nums[i];
            c=1;
            while(map.containsKey(flag+1)){
                c++;
                flag+=1;
            }
            c1=Math.max(c1,c);
            c=0;
            }
        }
        return c1;
    }
}
