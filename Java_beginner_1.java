// 演習課題「1から6のサイコロを作る」
// 数の表示とサイコロ
public class Main {
	public static void main(String[] args) {
		double rand = Math.random() * 6 + 1;
		int number = (int)rand;
		System.out.println("サイコロの目は" + number + "です");
	}
}

// 演習課題「モンスターに与えるダメージを出力！」
public class Main {
	public static void main(String[] args) {
		double rand = Math.random() * 49 + 50;
		int number = (int)rand;
		System.out.println("モンスターに、" + number + "のダメージを与えた");
	}
}

// 演習課題「計算してみよう」
public class Main {
	public static void main(String[] args) {
		// ここに計算式を書いて、出力する
		int number = 1234 * 5678 / 2;
		System.out.println(number);
	}
}

// 演習課題「変数で計算してみよう」
public class Main {
	public static void main(String[] args) {
		int a = 31;
		int b = 17;
		// 以下に、aとbのかけ算し、結果を出力するコードを書いてください
        System.out.println(a * b);
	}
}

// 演習課題「余りを計算してみよう」
public class Main {
	public static void main(String[] args) {
		int x = 8;
		int y = 5;
		// 以下に、xとyを割ったときの余りを計算し、結果を出力するコードを書いてください
        System.out.println(8 % 5);
	}
}

// 演習課題「カッコを付けて計算してみよう」
public class Main {
	public static void main(String[] args) {
		// 以下に計算式を書いて、結果を出力する
		int number = (1234 + 5678) * 3;
		System.out.println(number);
	}
}

// 演習課題「スライムの合計体重を出力！」
public class Main {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 10 + 1);	// 匹数 1 ～ 10
		System.out.println("体重100キロのスライムが、" + number + "匹あらわれた。");
		// 合計体重 =匹数 × 100
        int total = number * 100;
        System.out.println("スライムの合計体重は、" + total + "キロです。");
	}
}

// 演習課題「エラー箇所を正しく修正しよう vol.1」
public class Main {
	public static void main(String[] args) {
		int x = 50;
		System.out.println(x - 10);
	}
}

//  演習課題「エラー箇所を正しく修正しよう Vol.2」
public class Main {
	public static void main(String[] args) {
		String a = "モンスターが";
		String b = "あらわれた";
		System.out.println(a + b);
	}
}

//  演習課題「エラー箇所を正しく修正しよう Vol.3」
public class Main {
	public static void main(String[] args) {
		String a = "01234";
		String b = "56789";
		System.out.println(a + b);
	}
}