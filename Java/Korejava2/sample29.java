class Drink {
	String name;
	int capacity;
	int divide(int p) {
		return capacity / p;
	}
}
public class sample29 {
	public static void main(String[] args) {
		Drink wine = new Drink();
		int i;
		int p = 100;
		wine.name = "ワイン";
		wine.capacity = 750;
		i = wine.divide(p);
		System.out.println("名前:" + wine.name);
		System.out.println(p + "mlで" + i + "杯取れます");
	}
}
