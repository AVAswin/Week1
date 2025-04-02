class PalindromeChecker {
    String text;

    PalindromeChecker(String t) {
        text = t;
    }

    public void isPalindrome() {
        int start = 0;
        int end = text.length()-1;
        Boolean Flag = true;
        while(start <= end) {
            if(text.charAt(start) != text.charAt(end)) {
                Flag = false;
                break;
            }
            start++;
            end--;
        }

        if(Flag == true) {
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }
}
