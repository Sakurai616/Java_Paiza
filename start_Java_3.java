/* 演習課題「特定の条件で数値を表示 その 1」*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
      
        if (number >= 100) {
          System.out.println(number);
        }
    }
}

/* 演習課題「特定の条件で数値を表示 その 2」*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        if (number < 100) {
          System.out.println(number);   
        }
    }
}