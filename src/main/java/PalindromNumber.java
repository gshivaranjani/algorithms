import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();

        int reverse = 0;

        System.out.println("quotient:  "+number/10);
        System.out.println("reminder: "+number%10);
        int palindrome = number;

        while(palindrome!=0) {
            int reminder = palindrome % 10;
            palindrome = palindrome/10;
            reverse = reverse*10+reminder;
        }

        if(reverse == number)
            System.out.println("Palindrome");
        else
            System.out.println("NOT Palindrome");
    }


}
