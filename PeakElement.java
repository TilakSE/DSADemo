import java.util.Arrays;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int l=0, r=nums.length-1;
        while (l<r) {
            int m = (l + r)/2;
            if (nums[m] > nums[m+1]) r = m;
            else l = m+1;
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println("13. Find Peak Element");
        int[][] p13 = {{1,2,3,1},{1,2,1,3,5,6,4},{1},{2,1},{1,2}};
        for (int[] arr : p13) System.out.printf("%s -> %d%n", Arrays.toString(arr), findPeakElement(arr));
        System.out.println();
    }
}
