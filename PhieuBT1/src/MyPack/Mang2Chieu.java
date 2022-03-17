package MyPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mang2Chieu {
	static Scanner scanner = new Scanner(System.in);

	public static void nhap(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
				a[i][j] = scanner.nextInt();
			}
		}
	}

	// Bai 11
	public static void TimNtoMax() {
		int soDong, soCot;
		System.out.println("Nhập vào số dòng của mảng: ");
		soDong = scanner.nextInt();
		System.out.println("Nhập vào số cột của mảng: ");
		soCot = scanner.nextInt();
		int[][] A = new int[soDong][soCot];
		nhap(A, soDong, soCot);

		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (SNT(A[i][j])) {
					list.add(A[i][j]);
				}
			}
		}
		list.sort((o1, o2) -> o2 - o1);
		System.out.print("Cac so ngto trong mang: ");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println("\nSo nguyen to max trong mang la: " + list.get(0));
	}

	// check so nto
	public static boolean SNT(int x) {
		if (x < 2)
			return false;
		for (int i = 2; i <= x / 2; i++)
			if (x % i == 0)
				return false;
		return true;
	}

	// Bai 12
	public static void NhanMT() {
		int m1, n1; // số dòng và số cột của ma trận A
		int m2, n2; // số dòng và số cột của ma trận B

		System.out.println("Nhập vào số dòng của ma trận A: ");
		m1 = scanner.nextInt();
		System.out.println("Nhập vào số cột của ma trận A: ");
		n1 = scanner.nextInt();

		System.out.println("Nhập vào số dòng của ma trận B: ");
		m2 = scanner.nextInt();
		System.out.println("Nhập vào số cột của ma trận B: ");
		n2 = scanner.nextInt();
		int[][] A = new int[m1][n1];
		int[][] B = new int[m2][n2];

		int C[][] = new int[m1][n2];

		while (m1 > 0 && n1 > 0 && m2 > 0 && n2 > 0) {
			if (n1 != m2) {
				System.out.println("Để nhân hai ma trận thì " + "số cột của ma trận A phải bằng số dòng của ma trận B");
				System.out.println("Nhập lại số cột của ma trận A: ");
				n1 = scanner.nextInt();
				System.out.println("Nhập vào số dòng của ma trận B: ");
				m2 = scanner.nextInt();
			} else {
				// nhập giá trị của các phần tử cho 2 ma trận A
				System.out.println("Nhập vào các phần tử của ma trận A: ");
				for (int i = 0; i < m1; i++) {
					for (int j = 0; j < n1; j++) {
						System.out.print("A[" + i + "][" + j + "] = ");
						A[i][j] = scanner.nextInt();
					}
				}
			}

			System.out.println("Nhập vào các phần tử của ma trận A: ");
			for (int i = 0; i < m2; i++) {
				for (int j = 0; j < n2; j++) {
					System.out.print("B[" + i + "][" + j + "] = ");
					B[i][j] = scanner.nextInt();
				}
			}

			// hiển thị 2 ma trận vừa nhập
			System.out.println("Ma trận A: ");
			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n1; j++) {
					System.out.print(A[i][j] + "\t");
				}
				System.out.println("\n");
			}

			System.out.println("Ma trận B: ");
			for (int i = 0; i < m2; i++) {
				for (int j = 0; j < n2; j++) {
					System.out.print(B[i][j] + "\t");
				}
				System.out.println("\n");
			}
			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n2; j++) {
					C[i][j] = 0;
					for (int k = 0; k < n1; k++) {
						C[i][j] = C[i][j] + A[i][k] * B[k][j];
					}
				}
			}

			// hiển thị ma trận tích C
			System.out.println("Ma trận tích C: ");
			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n2; j++) {
					System.out.print(C[i][j] + "\t");
				}
				System.out.println("\n");
			}
		}
	}

	public static void main(String[] args) {
//		TimNtoMax();
		NhanMT();
	}
}
