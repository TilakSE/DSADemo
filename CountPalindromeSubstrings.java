public class CountPalindromeSubstrings {
    public static int countPalindromicSubstrings(String s) {
        if (s==null || s.length()==0) return 0;
        int count=0;
        for (int i=0;i<s.length();i++) {
            count += expandCount(s,i,i);
            count += expandCount(s,i,i+1);
        }
        return count;
    }
    private static int expandCount(String s, int l, int r) {
        int c=0;
        while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) { c++; l--; r++; }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("18. Count All Palindromic Substrings");
        String[] p18 = {"abc","aaa","a","ababa","abcd"};
        for (String s : p18) System.out.printf("%s -> %d%n", s, countPalindromicSubstrings(s));
        System.out.println();
    }
}
