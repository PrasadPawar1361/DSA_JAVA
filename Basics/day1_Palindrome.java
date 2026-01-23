package Basics;

class day1_Palindrome {

    public static boolean isPalindrome(int z) {

        // Negative numbers are not palindrome
        if (z < 0) {
            return false;
        }

        int n = z;
        int revnum = 0;

        while (n > 0) {
            int d = n % 10;
            revnum = revnum * 10 + d;
            n = n / 10;
        }

        return revnum == z;
    }

    public static void main(String[] args) {
        int num = 121;

        if (isPalindrome(num)) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is NOT Palindrome");
        }
    }
}
