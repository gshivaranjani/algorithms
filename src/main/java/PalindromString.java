import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        String reverse="";
        for(int i=ch.length-1;i>=0;i--){
            reverse=reverse+ch[i];
        }

        if(str.equals(reverse))
            System.out.println("It is a Palindrom");
        else
            System.out.println("NOT a Palindrom");
    }
}
