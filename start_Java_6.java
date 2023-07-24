// 演習課題「100 回繰り返す」
public class Main {
    public static void main(String[] args) {
        
        for (int i = 0; i < 100; i ++) {
            System.out.println("Hello paiza");
        }
    }
}

// 演習課題「標準入力で指定した回数繰り返す」
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Hello paiza");
        }
    }
}