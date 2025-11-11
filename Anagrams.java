import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray(); Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println("10. Group Anagrams");
        String[][] p10 = {{ "bat", "tab", "cat" },{ "listen","silent","enlist" },{ "a" },{ "abc","def","cba" },{}};
        for (String[] arr : p10) System.out.printf("%s -> %s%n", Arrays.toString(arr), groupAnagrams(arr));
        System.out.println();
    }
}
