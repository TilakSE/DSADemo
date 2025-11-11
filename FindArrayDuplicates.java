import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindArrayDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> dup = new LinkedHashSet<>();
        for (int n : nums) {
            if (!seen.add(n)) dup.add(n);
        }
        return new ArrayList<>(dup);
    }

    public static void main(String[] args) {
        System.out.println("16. Find All Duplicates in Array");
        int[][] p16 = {{4,3,2,7,8,2,3,1},{1,1,2},{1,2,3},{5,5,5,5},{10,20,10,30,20}};
        for (int[] arr : p16) System.out.printf("%s -> %s%n", Arrays.toString(arr), findDuplicates(arr));
        System.out.println();
    }
}
