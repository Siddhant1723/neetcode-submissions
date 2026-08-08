class Solution {
    public int trap(int[] height) {
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        int[] min=new int[height.length];
        int sum=0;
        int s=0;
        for(int i=0;i<height.length;i++){
            if(i==0)
            leftmax[i]=0;
            else if(i==1)
            leftmax[i]=height[i-1];
            else
            leftmax[i]=Math.max(leftmax[i-1],height[i-1]);
        }
        for(int i=height.length-1;i>=0;i--){
            if(i==height.length-1)
            rightmax[i]=0;
            else if(i==height.length-2)
            rightmax[i]=height[i+1];
            else
            rightmax[i]=Math.max(rightmax[i+1],height[i+1]);
        } 
        for(int i=0;i<height.length;i++){
            min[i]=Math.min(leftmax[i],rightmax[i]);
        }
        for(int i=0;i<height.length;i++){
            s=min[i]-height[i];
            if(s>=0)
            sum+=s;
        }
        return sum;
    }
}
