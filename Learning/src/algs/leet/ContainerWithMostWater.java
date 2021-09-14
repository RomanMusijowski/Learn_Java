package algs.leet;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
       int maxArea = 0;
       for (int a = 0; a < height.length; a++) {
            for (int b = a + 1; b < height.length; b++) {
                maxArea = Math.max(maxArea, Math.min(height[a], height[b]) * (b-a));
            }
       }
        return maxArea;
    }
}
