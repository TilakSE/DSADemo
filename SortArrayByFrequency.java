import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArrayByFrequency {
    public static int[] sortByFrequency(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for (int n: nums) freq.put(n, freq.getOrDefault(n,0)+1);
        return Arrays.stream(nums)
            .boxed()
            .sorted((a,b) -> {
                int f = freq.get(b) - freq.get(a);
                if (f != 0) return f;
                return a - b;
            })
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public static void main(String[] args) {
        System.out.println("9. Sort Array by Frequency");
        int[][] p9 = {{4,4,1,2,2,2,3},{1,1,2,2,3},{5,5,5,6,6,7},{9,8,7,8,9,9},{1}};
        for (int[] arr : p9) System.out.printf("%s -> %s%n", Arrays.toString(arr), Arrays.toString(sortByFrequency(arr)));
        System.out.println();
    }
}
