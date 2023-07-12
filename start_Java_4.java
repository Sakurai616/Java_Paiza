/* 演習課題「数値の大きさを判定する」*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
      
        if (number > 100) {
            System.out.println(number);
        } else {
            System.out.println("100以下です");
        }
    }
}

/* 演習課題「数値の大きさを判定する - その2」*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
      
        if (number == 100) {
            System.out.println(number);
        } else if (number > 100) {
            System.out.println("100より大きい");
        } else {
            System.out.println("100より小さい");
        }
    }
}