// Main.java
public class Main {
    public static void main(String[] args) {
        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        String[] testInputs = {
                "madam",
                "hello",
                "A man a plan a canal Panama",
                "racecars"
        };

        for (String input : testInputs) {
            boolean result = checker.checkPalindrome(input);
            System.out.println(input + " → " + (result ? "Palindrome" : "Not Palindrome"));
        }
    }
}
