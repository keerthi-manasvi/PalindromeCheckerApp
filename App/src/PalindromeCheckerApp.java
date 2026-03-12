public class PalindromeCheckerApp {
    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }
    public static void main(String[] args) {
        String input = "madam";
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        String input1 = "medow";
        if (isPalindrome(input1)) {
            System.out.println(input1 + " is a palindrome.");
        } else {
            System.out.println(input1 + " is not a palindrome.");
        }
    }
}
