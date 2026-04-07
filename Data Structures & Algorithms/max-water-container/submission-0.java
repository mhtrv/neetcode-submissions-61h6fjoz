class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        for(int i=0;i<heights.length-1;i++){
            for(int j=0;j<heights.length;j++){
                int min=Math.min(heights[i],heights[j]);
                int area=min*(j-i);
                if(area>maxArea){
                    maxArea=area;
                }
            }
        }

        return maxArea;
    }
}
