import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class Parent {
    int x=10;

    public void abc(){
        System.out.println("This is parent:  "+x);
    }
}

class Child extends Parent {
    int x=20;

    public void abc(){
        System.out.println("This is child:  "+x);
    }
}

public class Test {
    public static void main(String[] args) {

        Parent p = new Child();
        p.abc();
        System.out.println(p.x);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:  ");
//
//        int n = sc.nextInt();
//        int feb1=1,feb2=1,s=1;
//
//        for(int i=1;i<=n;i++) {
//            if(i==1 || i==2){
//                s=1;
//            } else {
//                s=feb1+feb2;
//                feb1 = feb2;
//                feb2 = s;
//            }
//            System.out.print(s+" , ");
//        }

    }
}
