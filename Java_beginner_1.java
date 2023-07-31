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