package MyPack;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Nhap mang: ");
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
