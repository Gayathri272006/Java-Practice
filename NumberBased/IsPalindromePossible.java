import java.util.Scanner;

public class IsPalindromePossible {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;
        int odd = 0;

        for (int i = 0; i <= 9; i++) {
            int count = 0;
            n = original;

            while (n > 0) {
                int rem = n % 10;

                if (rem == i) {
                    count++;
                }

                n = n / 10;
            }

            if (count % 2 != 0) {
                odd++;
            }
        }

        if (odd <= 1)
            System.out.println("Palindrome Possible");
        else
            System.out.println("Palindrome Not Possible");  
    }
}
