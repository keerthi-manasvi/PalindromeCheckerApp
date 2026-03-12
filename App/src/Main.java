public class Main {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        PalindromeStrategy[] strategies = {
                new ArrayStrategy(),
                new StackStrategy(),
                new DequeStrategy()
        };

        String[] names = {"ArrayStrategy", "StackStrategy", "DequeStrategy"};

        for (int i = 0; i < strategies.length; i++) {
            long startTime = System.nanoTime();
            boolean result = strategies[i].checkPalindrome(input);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println(names[i] + ": " +
                    (result ? input + " is a Palindrome" : input + " is not Palindrome") +
                    " | Time = " + duration + " ns");
        }
    }
}