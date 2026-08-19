class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        if(nums.length==1){
            if(nums[0]==target)
            return 0;
            else 
            return -1;
        }
        while(low<high){
        mid=low+(high-low)/2;
        if(nums[mid]>nums[high])
        low=mid+1;
        else
        high=mid;
        }
        int pivot=low;
        low=0;
        high=nums.length-1;
        if(pivot==0){
            while(low<=high){
                mid=low+(high-low)/2;
                if(target==nums[mid])
                    return mid;
                else if(target>nums[mid])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        else if(target<=nums[high]){
            low=pivot;
            while(low<=high){
                mid=low+(high-low)/2;
                if(target==nums[mid])
                    return mid;
                else if(target>nums[mid])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        else{
            low=0;
            high=pivot-1;
            while(low<=high){
                mid=low+(high-low)/2;
                if(target==nums[mid])
                    return mid;
                else if(target>nums[mid])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
