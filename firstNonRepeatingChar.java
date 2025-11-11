import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingChar {
    public static Character firstNonRepeating(String s) {
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char c : s.toCharArray()) count.put(c, count.getOrDefault(c,0)+1);
        for (Map.Entry<Character,Integer> e : count.entrySet()) {
            if (e.getValue() == 1) return e.getKey();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("2. First Non-Repeating Character");
        String[] p2 = {"aabbccde", "xxyz", "aabb", "abcabc", "swiss"};
        for (String s : p2) System.out.printf("%s -> %s%n", s, String.valueOf(firstNonRepeating(s)));
        System.out.println();
    }
}
