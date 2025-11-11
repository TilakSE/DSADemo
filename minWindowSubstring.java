public class minWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s==null || t==null || s.length()==0 || t.length()==0) return "";
        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;
        int left=0, right=0, required = t.length();
        int minLen = Integer.MAX_VALUE, minLeft=0;
        while (right < s.length()) {
            char r = s.charAt(right++);
            if (need[r] > 0) required--;
            need[r]--;
            while (required == 0) {
                if (right - left < minLen) { minLen = right-left; minLeft = left; }
                char l = s.charAt(left++);
                need[l]++;
                if (need[l] > 0) required++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft+minLen);
    }

    public static void main(String[] args) {
        System.out.println("20. Minimum Window Substring");
        String[][] p20 = {{"ADOBECODEBANC","ABC"},{"a","a"},{"a","aa"},{"ab","b"},{"abcdebdde","bde"}};
        for (String[] pair : p20) System.out.printf("%s, %s -> %s%n", pair[0], pair[1], minWindow(pair[0], pair[1]));
        System.out.println();
    }
}
