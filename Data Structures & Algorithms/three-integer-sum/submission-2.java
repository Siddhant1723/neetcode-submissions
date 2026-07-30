class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int p1,p2,p3;
       p1=0;
       p2=1;
       p3=nums.length-1;
       Arrays.sort(nums);
       List<List<Integer>> list=new ArrayList<>();
       int i=0;
        while(i<nums.length){
        p1=-nums[i];
        p2=i+1;
        p3=nums.length-1;
        while(p2<p3){
            if(nums[p2]+nums[p3]==p1){
                list.add(Arrays.asList(nums[i],nums[p2],nums[p3]));
                p2++;
                p3--;
                while(p2<p3&&nums[p2]==nums[p2-1])
                p2++;
                while(p3>p2&&nums[p3]==nums[p3+1])
                p3--;
            }
            else if(nums[p2]+nums[p3]>p1){
                p3--;
                if(nums[p3]==nums[p3+1])
                p3--;
            }
            else{
                p2++;
                if(nums[p2]==nums[p2-1])
                p2++;
            }

        }
        i++;
         while(i<nums.length&&nums[i]==nums[i-1])
            i++;
    }
       
        return list;
    }
}

