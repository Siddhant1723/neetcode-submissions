class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int c=0;
        Deque<Double> stack=new ArrayDeque<>();
        int[][] matrix=new int[position.length][2];
        for(int i=0;i<speed.length;i++){
            matrix[i][0]=target-position[i];
            matrix[i][1]=speed[i];
        }
        Arrays.sort(matrix ,(a,b)->Integer.compare(a[0],b[0]));
        double[] time=new double[position.length];
        for(int i=0;i<time.length;i++){
            time[i]=(double)matrix[i][0]/matrix[i][1];
        }
        for(int i=0;i<time.length;i++){
            if(i==0)
            stack.push(time[i]);
            else if(time[i]>stack.peek())
            stack.push(time[i]);
        }
        return stack.size();
    }
}
