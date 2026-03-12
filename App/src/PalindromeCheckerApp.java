import java.util.*;

// Strategy interface
interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// Strategy 1: Two-pointer array approach
class ArrayPalindromeStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String str) {
        String normalized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0, end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// Strategy 2: Stack approach
class StackPalindromeStrategy implements PalindromeStrategy {
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

// Strategy 3: Deque approach
class DequePalindromeStrategy implements PalindromeStrategy {
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

// Context class
class PalindromeService {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeCheck(String str) {
        if (strategy == null) {
            throw new IllegalStateException("No strategy set!");
        }
        return strategy.checkPalindrome(str);
    }
}
