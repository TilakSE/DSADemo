import java.util.Arrays;

public class BinarySearchRotatedArray {
    public static int searchRotated(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r) {
            int m = (l+r)/2;
            if (nums[m]==target) return m;
            if (nums[l] <= nums[m]) {
                if (target>=nums[l] && target<nums[m]) r=m-1;
                else l=m+1;
            } else {
                if (target>nums[m] && target<=nums[r]) l=m+1;
                else r=m-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("8. Binary Search in Rotated Array");
        int[][] p8 = {{4,5,6,7,0,1,2},{4,5,6,7,0,1,2},{1},{6,7,8,1,2,3,4,5},{2,3,4,5,1}};
        int[] targets8 = {0,3,1,3,1};
        for (int i=0;i<p8.length;i++) System.out.printf("%s target=%d -> %d%n", Arrays.toString(p8[i]), targets8[i], searchRotated(p8[i], targets8[i]));
        System.out.println();
    }
}