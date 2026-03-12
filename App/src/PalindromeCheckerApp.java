import java.util.*;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        String input1 = "Palindrome";
        if (isPalindrome(input1)) {
            System.out.println(input1 + " is a Palindrome.");
        } else {
            System.out.println(input1 + " is not a Palindrome.");
        }
    }
}


