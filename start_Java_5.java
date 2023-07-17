/* 演習課題「文字列に一致しているか判定する」*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String greeting = scan.next();

        if (greeting.equals("Hello")) {
          System.out.println("こんにちは");
        }
    }
}

/* 演習課題「文字列に一致しているか判定する -2」*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String greeting = scan.next();
        
        if (greeting.equals("Hello")) {
            System.out.println("こんにちは");
        } else {
            System.out.println("さようなら");
        }
    }
}