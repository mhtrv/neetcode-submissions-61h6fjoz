class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            //System.out.println("i:"+i);
            int minHeight=heights[i];
            for(int j=i;j<heights.length;j++){
                minHeight=Math.min(minHeight,heights[j]);
                int currArea=0;
                if(i==j){
                    currArea=minHeight;
                }else{
                    currArea=minHeight*(j-i+1);
                }
                if(currArea>maxArea){
                    maxArea=currArea;
                }
            }
        }
        return maxArea;
    }
}
