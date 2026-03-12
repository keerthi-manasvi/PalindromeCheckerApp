public class PalindromeCheckerApp {
    // Normalize string: remove spaces & non-alphanumeric, convert to lowercase
    private static String normalize(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Check palindrome using two-pointer approach
    public static boolean isPalindrome(String str) {
        String normalized = normalize(str);
        int start = 0, end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false; // mismatch found
            }
            start++;
            end--;
        }
        return true; // all characters matched
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
