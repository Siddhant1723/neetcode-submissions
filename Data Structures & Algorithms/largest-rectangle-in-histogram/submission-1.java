class Solution {
    public int largestRectangleArea(int[] heights) {
    Deque<Integer> stack=new ArrayDeque<>();
    int area=0;
    int a=0;
    int width=0;
        int pop=0;

    for(int i=0;i<heights.length;i++){
        while(!stack.isEmpty()&&heights[i]<=heights[stack.peek()]){
            pop=stack.pop();
            if(stack.isEmpty())
            width=i;
            else
            width=i-stack.peek()-1;

            a=heights[pop]*width;
            area=Math.max(area,a);
        }
        stack.push(i);
        
    }
    width=heights.length-1;
    while(!stack.isEmpty()){
        pop=stack.pop();
        if(stack.isEmpty())
        width=heights.length;
        else
        width=heights.length-stack.peek()-1;
        a=heights[pop]*(width);
        area=Math.max(area,a);
    }

    return area;
    }
}
