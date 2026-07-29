class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      int u=1;
      int init=nums[0];
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=init){
            u++;
            init=nums[i];
        }
      }
        int c=1;
        int r=0;
        int arr[][]=new int[u][2];
        init=nums[0];
       for (int i = 0; i < nums.length; i++) {
    
    if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
        c++;
    } else {
        arr[r][0] = nums[i];
        arr[r][1] = c;
        r++;
        
        c = 1;
    }
}
            c=0;
            r=k;
            Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
            int[] result=new int[k];
            for(int i=arr.length-1;i>=0;i--){
                result[c]=arr[i][0];
                c++;
                if(c==k)
                    break;
            }
            return result;
        }
    }  
    

