import java.util.Arrays;

public class FindLongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length==0) return "";
        String prefix = strs[0];
        for (int i=1;i<strs.length;i++) {
            while (!strs[i].startsWith(prefix)) {
                if (prefix.length()==0) return "";
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println("17. Longest Common Prefix");
        String[][] p17 = {{"flower","flow","flight"},{"dog","racecar","car"},{"interspecies","interstellar","interstate"},{"throne","throne"},{"prefix","preach","prevent"}};
        for (String[] arr : p17) System.out.printf("%s -> %s%n", Arrays.toString(arr), longestCommonPrefix(arr));
        System.out.println();
    }
}
