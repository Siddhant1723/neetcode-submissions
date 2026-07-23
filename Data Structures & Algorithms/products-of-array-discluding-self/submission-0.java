class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        Arrays.fill(prefix,1);
        int[] suffix=new int[nums.length];
        Arrays.fill(suffix,1);
        int[] result=new int[nums.length];
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prefix[i]=prod;
            prod*=nums[i];        
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--){
            suffix[i]=prod;
            prod*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            result[i]=prefix[i]*suffix[i];
        }
        return result;
    }
}  
