public class Palindrome {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123, reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number = " + reverse);
    }
}
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

