public class sample52 {
	public static void main(String[] args) {
		calc(10, 0);
	}
	static void calc (int i, int j) {
		try {
			System.out.println(i/j);
		} catch (Exception e) {
			System.out.println("数値0で割ろうとしました");
		}
	}
}
