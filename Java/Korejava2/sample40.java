class Calc {
	int m = 1;
	int sum(int i){
		return i + m;
	}
	int sum2(int i){
		return i - m;
	}
}
class Multiply extends Calc{
	void sum3(int i, int j){
		int k = sum(i);
		int n = sum2(j);
		System.out.println("mの値：" + m);
		System.out.println("結果：" + (k * n));
	}
}
public class sample40 {
	public static void main(String[] args) {
		Multiply multi = new Multiply();
		multi.sum3(5, 4);
	}
}
