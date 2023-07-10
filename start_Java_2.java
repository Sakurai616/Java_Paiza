/* 演習課題「整数データを受け取って表示しよう」*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(number);
    }
}

/* 演習課題「変数で連結しよう」*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("リンゴが" + number + "個");
    }
}