public class longestPalindromeSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start=0, end=0;
        for (int i=0;i<s.length();i++) {
            int len1 = expandAround(s, i, i);
            int len2 = expandAround(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len > end-start+1) {
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }
    private static int expandAround(String s, int left, int right) {
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--; right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        System.out.println("11. Longest Palindromic Substring");
        String[] p11 = {"babad","cbbd","a","forgeeksskeegfor","abacdfgdcaba"};
        for (String s : p11) System.out.printf("%s -> %s%n", s, longestPalindrome(s));
        System.out.println();
    }
}
