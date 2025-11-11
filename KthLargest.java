import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) {
            pq.offer(n);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        System.out.println("14. Find Kth Largest Element");
        int[][] p14 = {{3,2,1,5,6,4},{3,2,3,1,2,4,5,5,6},{1},{7,10,4,3,20,15},{5,5,5,5}};
        int[] k14 = {2,4,1,3,2};
        for (int i=0;i<p14.length;i++) System.out.printf("%s k=%d -> %d%n", Arrays.toString(p14[i]), k14[i], findKthLargest(p14[i], k14[i]));
        System.out.println();
    }
}
