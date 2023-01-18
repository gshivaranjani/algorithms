import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:  ");
        int n = sc.nextInt();
        int feb1 =1, feb2=1, s=0;

        for(int i=1;i<=n;i++) {
            if(i==1 || i==2) {
                s=1;
            }
            else {
                s=feb1+feb2;
                feb1 = feb2;
                feb2 = s;
            }
            System.out.print(s+" , ");
        }
    }
}
