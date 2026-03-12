import java.util.*;

// Strategy interface
interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String str) {
        String normalized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char ch : normalized.toCharArray()) stack.push(ch);
        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String str) {
        String normalized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();
        for (char ch : normalized.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

// Two-pointer array strategy
class ArrayStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String str) {
        String normalized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0, end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
