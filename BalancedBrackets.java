import java.util.*;

class BalancedBrackets{
    public static boolean isBalanced(String s) {
        Map<Character, Character> pairs = Map.of(')', '(', '}', '{', ']', '[');
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (pairs.containsValue(c)) { // opening
                stack.push(c);
            } else if (pairs.containsKey(c)) { // closing
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Problem 1
        System.out.println("1. Validate Balanced Brackets");
        String[] p1 = {"(){}[]", "({[]})", "({[)]}", "((()))", "({})["};
        for (String s : p1) System.out.printf("%s -> %b%n", s, isBalanced(s));
        System.out.println();
    }
}