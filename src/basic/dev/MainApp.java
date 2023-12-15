package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("A = ");
		a = sc.nextInt();

		System.out.println("B = ");
		b = sc.nextInt();
		System.out.println("Tong A + B = ");
		int tong = a + b;
		System.out.println(a + " + " + b + " = " + tong);

		System.out.println("Hieu A - B = ");
		int hieu = a - b;
		System.out.println(a + " - " + b + " = " + hieu);

		System.out.println("Tich A * B = ");
		int tich = a * b;
		System.out.println(a + " * " + b + " = " + tich);

		System.out.println("Thuong A / B = ");
		double thuong = a / b;
		System.out.println(a + " / " + b + " = " + thuong);
		System.out.println("c = ");
		c = sc.nextInt();
		System.out.println(c + " < " + a + (c < a));
		System.out.println(c + " > " + a + (c > a));
		System.out.println(c + " =< " + a + (c <= a));
		System.out.println(c + " => " + a + (c >= a));
	}

}
