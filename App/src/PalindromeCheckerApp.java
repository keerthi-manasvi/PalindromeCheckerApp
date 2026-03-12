import java.util.*;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String input = "radar";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        String input1 = "random";
        if (isPalindrome(input1)) {
            System.out.println(input1 + " is a palindrome.");
        } else {
            System.out.println(input1 + " is not a palindrome.");
        }
    }
}


