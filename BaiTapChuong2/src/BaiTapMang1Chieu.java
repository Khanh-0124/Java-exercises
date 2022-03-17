import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BaiTapMang1Chieu {

	static Scanner sc = new Scanner(System.in);

	public static void Nhap(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = ", i); // Nhập phần tử mảng
			a[i] = sc.nextInt();
		}
	}

	public static void Xuat(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t"); // Xuất Mảng 1 chiều
		}
	}

//Cau b tinh tong day so
	public static long TinhTong(int a[]) {
		long S = 0;
		for (int i = 0; i < a.length; i++) {
			S += a[i]; // Tính tổng các phần tử
		}
		return S;
	}

//cau c
	// Sắp xếp tăng
	public static void sx_T(int a[], int n) {
		int tg;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					// Hoan vi 2 so a[i] va a[j]
					tg = a[i];
					a[i] = a[j];
					a[j] = tg;
				}
			}
		}
		Xuat(a);
	}

	// sắp xếp giảm
	public static void sx_G(int a[], int n) {
		int tg;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					// Hoan vi 2 so a[i] va a[j]
					tg = a[i];
					a[i] = a[j];
					a[j] = tg;
				}
			}
		}
		Xuat(a);
	}

//cau d
	public static void Tach(int a[]) {
		Integer[] aInt = Arrays.stream(a).boxed().toArray(Integer[]::new);
//		System.out.println();
		ArrayList<Integer> l1 = new ArrayList<Integer>();		//Khoi tao array list
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		for (Integer i : aInt) {
			if (i % 2 == 0)
				l2.add(i);		//add mang chan
			else
				l1.add(i);		//add mang le
		}
		System.out.println("\nMang Chan: " + l2);
		System.out.println("Mang Le: " + l1);
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		int a[] = new int[n]; // Khai bảo mảng 1 chiều

		Nhap(a);
		System.out.print("Xuat Mang: ");
		Xuat(a);
		System.out.println("\nTong day so: " + TinhTong(a));
		System.out.print("sx tang dan: ");
		sx_T(a, n);
		System.out.print("\nsx giam dan: ");
		sx_G(a, n);
		Tach(a);

	}
}
