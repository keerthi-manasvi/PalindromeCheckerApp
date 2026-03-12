public class Main {
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();
        String input = "A man a plan a canal Panama";

        // Use Array strategy
        service.setStrategy(new ArrayPalindromeStrategy());
        System.out.println("Array Strategy: " + input + " → " +
                (service.executeCheck(input) ? "Palindrome" : "Not Palindrome"));

        // Use Stack strategy
        service.setStrategy(new StackPalindromeStrategy());
        System.out.println("Stack Strategy: " + input + " → " +
                (service.executeCheck(input) ? "Palindrome" : "Not Palindrome"));

        // Use Deque strategy
        service.setStrategy(new DequePalindromeStrategy());
        System.out.println("Deque Strategy: " + input + " → " +
                (service.executeCheck(input) ? "Palindrome" : "Not Palindrome"));
    }
}