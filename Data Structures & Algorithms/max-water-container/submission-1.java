class Solution {
    public int maxArea(int[] heights) {
      int p1,p2;
      p1=0;
      p2=heights.length-1;
      int prod=0;
      int mainprod=0;
      while(p1<p2){
        if(heights[p1]<heights[p2]){
            prod=heights[p1]*(p2-p1);
            p1++;
        }
        else{
            prod=heights[p2]*(p2-p1);
            p2--;
        }
        mainprod=Math.max(mainprod,prod);
      }
      return mainprod;  
    }
}
