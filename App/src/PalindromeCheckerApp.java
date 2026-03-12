public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        if(isPalindrome(input)){
            System.out.println(input+" is a Palindrome");
        }
        else{
            System.out.println(input+" is not a Palindrome");
        }
    }
}
