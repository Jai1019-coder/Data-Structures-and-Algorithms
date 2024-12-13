package maximumareainhistogram;

public class LeetcodeOptimise {
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] stack = new int[heights.length + 1];
        int top = -1;
        for (int i = 0; i <= heights.length; i++) {
            int height = i == heights.length ? 0 : heights[i];
            while (top >= 0 && height < heights[stack[top]]) {
            int h = heights[stack[top--]];
            int w = top == -1 ? i : i - stack[top] - 1;
            maxArea = Math.max(maxArea, w * h);
            }

            stack[++top] = i;
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
