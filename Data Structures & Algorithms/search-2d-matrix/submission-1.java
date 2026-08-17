class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mid=0;
        int low=0;
        int high=0;
        for(int i=0;i<matrix.length;i++){
            if(target<=matrix[i][matrix[i].length-1]){
                low=0;
                high=matrix[i].length-1;
                while(low<=high){
                    mid=low+(high-low)/2;
                    if(matrix[i][mid]==target)
                    return true;
                    else if(target>matrix[i][mid]){
                        low=mid+1;
                    }
                    else
                        high=mid-1;    
                }

            }

        }
        return false;
    }
}
