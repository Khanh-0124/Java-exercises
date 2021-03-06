package MyPack;

import java.util.Scanner;

public class ChuongTrinhTinh {
	static Scanner sc = new Scanner(System.in);

	// Bài 3 tính giai thừa
	public static int Tinhgt(int n) {
		if (n == 1)
			return 1;
		return n * Tinhgt(n - 1);
	}

	public static void GiaiThua() {
		int n;
		System.out.println("Nhập n: ");
		n = sc.nextInt();
		System.out.println(n + "! = " + Tinhgt(n));
	}

	// Bài 2 tính nghiệm phức PT B2
	public static void PTB2() {
		int numNo;
		float a, b, c;
		System.out.println("Nhập vào a, b, c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		double x1 = 0, x2 = 0;
		double delta = b * b - 4 * a * c;
		if (delta < 0) {
			x1 = x2 = 0f;
			numNo = 0;

		} else if (delta == 0) {
			x1 = x2 = -b / (2 * a);
			numNo = 1;
		} else {
			delta = Math.sqrt(delta);
			x1 = (-b + delta) / (2 * a);
			x2 = (-b - delta) / (2 * a);
			numNo = 2;
		}

		if (numNo == 0) {
			System.out.println("Phuong trinh da cho vo nghiem");
		} else if (numNo == 1) {
			System.out.println("Phuong trinh da cho co nghiem kep x=%.4f" + x1);
		} else {
			System.out.println("Phuong trinh da cho co hai nghiem phan biet \nx1 = " + x1 + "\nX2 = " + x2);
		}
	}

	// Bài 4 Tính C(m,n)
	public static int C(int m, int n) {
		if (m == 0 || m == n)
			return 1;
		if (m == 1)
			return n;
		return C(m - 1, n - 1) + C(m, n - 1);
	}

	public static void ToHop() {
		int m, n;
		System.out.println("Nhập m: ");
		m = sc.nextInt();
		System.out.println("Nhập n: ");
		n = sc.nextInt();
		System.out.println("C(m,n) = " + C(m, n));
	}

	// Bài 5 tìm UCLN
	public static int gcd(int a, int b) {
		if (a == 0 || b == 0) {
			return a + b;
		}
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	public static void GCD() {
		int a, b;
		System.out.println("Nhập a: ");
		a = sc.nextInt();
		System.out.println("Nhập b: ");
		b = sc.nextInt();
		System.out.println("UCLN(a,b) = " + gcd(a, b));

	}

	// bài 6 ktra số ngto
	public static boolean KTSNT(int x) {
		if (x < 2)
			return false;
		for (int i = 2; i <= x / 2; i++)
			if (x % i == 0)
				return false;
		return true;
	}

	public static void KtraNto() {
		int n;
		System.out.println("Nhap vao so nguyen duong n: ");
		n = sc.nextInt();
		if (KTSNT(n) == true)
			System.out.println(n + " la so nguyen to!");
		else
			System.out.println(n + " khong la so nguyen to!");
	}

}
