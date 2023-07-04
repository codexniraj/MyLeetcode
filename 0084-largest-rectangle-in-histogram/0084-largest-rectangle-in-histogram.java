class Solution {  
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 0) {
            return 0;
        }
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
         
        left[0] = -1;
        for(int i = 1; i < n; i++) {
            int smallerIndex = i-1;
            while(smallerIndex >= 0 && heights[smallerIndex] >= heights[i]) {
                smallerIndex = left[smallerIndex];
            }
            left[i] = smallerIndex;
        }
         
        right[n-1] = n;
        for(int i = n-2; i >= 0; i--) {
            int smallerIndex = i+1;
            while(smallerIndex < heights.length && heights[smallerIndex] >= heights[i]) {
                smallerIndex = right[smallerIndex];
            }
            right[i] = smallerIndex;
        }
         
        int maxArea = 0;
        for(int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, (right[i]-left[i]-1)*heights[i]);
        }
        return maxArea;
    }
}    