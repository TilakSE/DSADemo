import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElementsToRight {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i=0;i<n;i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                res[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("23. Next Greater Element");
        int[][] p23 = {{4,5,2,25},{13,7,6,12},{1,3,2,4},{5,4,3,2,1},{2,1,2,4,3}};
        for (int[] arr : p23) System.out.printf("%s -> %s%n", Arrays.toString(arr), Arrays.toString(nextGreaterElements(arr)));
        System.out.println();
    }
}
