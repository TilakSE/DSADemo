import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeSortedArrayUnique {
    public static int[] mergeSortedUnique(int[] a, int[] b) {
        List<Integer> out = new ArrayList<>();
        int i=0,j=0;
        Integer last = null;
        while (i<a.length || j<b.length) {
            int val;
            if (i<a.length && (j>=b.length || a[i]<b[j])) val = a[i++];
            else if (j<b.length && (i>=a.length || b[j]<a[i])) val = b[j++];
            else { // equal
                val = a[i]; i++; j++;
            }
            if (last == null || val != last) {
                out.add(val); last = val;
            }
        }
        return out.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println("3. Merge Two Sorted Arrays Without Duplicates");
        int[][] a1 = {{1,3,5},{1,2,2},{},{5,6},{1,3,5}};
        int[][] b1 = {{2,4,6},{2,3,4},{1,2,3},{5,6},{}};
        for (int i=0;i<a1.length;i++) System.out.printf("%s , %s -> %s%n", Arrays.toString(a1[i]), Arrays.toString(b1[i]), Arrays.toString(mergeSortedUnique(a1[i], b1[i])));
        System.out.println();
    }
}
