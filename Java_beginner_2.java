// 演習課題「順位が1位だったら「おめでとう！」と表示しよう」
// if文による条件分岐
public class Main {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 3 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		// ここにif文を追加する
        if (number == 1) {
            System.out.println("おめでとう！");
        }
	}
}

// 演習課題「順位が2位以下だったら「あと少し！」と表示する」
// if文による条件分岐
public class Main {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		// ここにif文を追加する
        if (number == 1) {
            System.out.println("おめでとう！");
        } else if (number >= 2) {
            System.out.println("あと少し！");
        }
	}
}

// 演習課題「間違い探し Vol.1」
// if文による条件分岐
public class Main {
	public static void main(String[] args) {
		int number =((int)(Math.random() * 3 + 1)) * 100;
		System.out.println("あなたの得点は" + number + "ポイントです");
		// ここにif文を追加する
		if (number == 300) {
		    System.out.println("おめでとう！");
		}
	}
}

// 演習課題「間違い探し Vol.2」
// if文による条件分岐
public class Main {
	public static void main(String[] args) {
		int number =((int)(Math.random() * 3 + 1)) * 100;
		System.out.println("あなたの得点は" + number + "ポイントです");
		// ここにif文を追加する
		if (number == 300) {
		    System.out.println("おめでとう！");
		} else if (number <= 200) {
		    System.out.println("ざんねん！");
		}
	}
}

// 演習課題「順位に合わせてメッセージを表示する」
// if文による条件分岐　else if
public class Main {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		// ここにif文を追加する
		if (number == 1) {
		    System.out.println("おめでとう！");
		} else if (number == 2) {
		    System.out.println("あと少し！");
		} else {
		    System.out.println("よくがんばったね");
		}
	}
}

// 演習課題「間違い探し」
// if文による条件分岐　else if
public class Main {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		if (number == 1) {
			System.out.println("おめでとう！");
		} else if (number == 2) {
			System.out.println("あと少し！");
		} else {
			System.out.println("よくがんばったね");
		}
	}
}

// 演習課題「飲酒可能な年齢か判定する！」
// if文による条件分岐　比較演算子
public class Main {
	public static void main(String[] args) {
		int age = (int)(Math.random() * 5 + 18);
		System.out.print(age + "才は");
		// ここにif文を追加する
        if (age < 20) {
            System.out.println("飲酒不可");
        } else if (age >= 20) {
            System.out.println("飲酒可能");
        }
	}
}

// 演習課題「間違い修正：入賞圏内か判別する」
// if文による条件分岐　比較演算子
public class Main {
	public static void main(String[] args) {
		int place = (int)(Math.random() * 12+ 1);
		System.out.print(place + "位");
		// ここにif文を追加する
		if (place >= 7) {
			System.out.println("入賞圏外");
		} else if (place <= 6) {
			System.out.println("入賞");
		}
	}
}