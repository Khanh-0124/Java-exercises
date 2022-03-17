import java.util.Scanner;

public class BaiTapMang2Chieu {
	static Scanner sc = new Scanner(System.in);

	public static void Nhap(int[][] a, int N, int M) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.printf("a[%d] = ", i);
				a[i][j] = sc.nextInt();
			}
		}
	}

	public static void Xuat(int[][] a, int N, int M) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.printf(a[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

	public static void TichMT(int[][] a, int[][] b, int[][] c, int m1, int n2, int n1) {
		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n2; j++) {
				c[i][j] = 0;
				for (int k = 0; k < n1; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
	}

	public static void main(String[] args) {
		int M1, N1;
		int M2, N2;
		
		System.out.println("Nhap M1: ");
		M1 = sc.nextInt();
		System.out.println("Nhap N1: ");
		N1 = sc.nextInt();
		int A[][] = new int[M1][N1];

		System.out.println("Nhap M2: ");
		M2 = sc.nextInt();
		System.out.println("Nhap N2: ");
		N2 = sc.nextInt();
		int B[][] = new int[M2][N2];
		int C[][] = new int[M1][N2];
		
		System.out.println("1.Nhap 2 ma tran A, B\n" + "2.Tinh tich C = A * B\n" + "3. Hien thi\n" + "4.Thoat");
		int chon;
		do {
			System.out.println("Nhap lua chon: ");
			chon = sc.nextInt();
			if (chon == 1) {
				System.out.println("Nhap ma tran A: ");
				Nhap(A, M1, N1);
				System.out.println("Nhap ma tran B: ");
				Nhap(B, M2, M2);
			} else if (chon == 2) {
				TichMT(A, B, C, M1, N2, N1);
			} else if (chon == 3) {
				System.out.println("Ma Tran A: ");
				Xuat(A, M1, N1);
				System.out.println("Ma Tran B: ");
				Xuat(B, M2, N2);
				System.out.println("Ma Tran A: ");
				Xuat(C, M1, N2);
			} else if (chon == 4) {
				System.out.println("Thoat thanh cong!");
			}

		} while (chon != 4);
	}
}
