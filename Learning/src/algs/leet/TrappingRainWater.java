package algs.leet;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public static int trap(int[] height) {
        if (height == null)
            return 0;

        int ans = 0;
        int size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        rightMax[size-1] = height[size-1];
        for (int i = size-2; i >=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 1; i < size - 1; i++) {
            ans += Math.min(leftMax[i], rightMax[i] - height[i]);
        }
        return ans;
    }
}
