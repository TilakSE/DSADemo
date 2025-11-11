import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countPairsWithGivenSum {
    public static long countPairsWithSum(int[] arr, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        long count = 0;
        for (int num : arr) {
            int need = target - num;
            count += freq.getOrDefault(need, 0);
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("4. Count Pairs with Given Sum");
        int[][] p4 = {{1,5,7,-1},{1,1,1,1},{10,12,10,15,-1,7,6},{5,5,5,5},{1,2,3,4}};
        int[] t4 = {6,2,16,10,8};
        for (int i=0;i<p4.length;i++) System.out.printf("%s target=%d -> %d%n", Arrays.toString(p4[i]), t4[i], countPairsWithSum(p4[i], t4[i]));
        System.out.println();

    }
}
