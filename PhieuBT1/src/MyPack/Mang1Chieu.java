package MyPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Mang1Chieu {
	static Scanner sc = new Scanner(System.in);

	// Bai 7 Tim kiem nhi phan
	public static int search(double arr[], int n, double x) {
		int i;
		for (i = 0; i < n; i++)
			if (arr[i] == x)
				return i;
		return -1;
	}

	public static void TKNP() {
		System.out.print("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		double[] arr = new double[n];
		System.out.print("Nhập các phần tử của mảng: \n");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = sc.nextDouble();
		}
		System.out.println("Mang: " + Arrays.toString(arr));
		System.out.println("Nhap vao gia tri can tim");

		double x = sc.nextDouble();
		int kq = search(arr, n, x);
		if (kq != -1) {
			System.out.println(x + " Xuat hien tai chi so: " + kq);
		} else {
			System.out.println(x + " Khong co trong mang");
		}

	}

	// Bai 8 Chen 1 phan tu vao mang
	public static void ThemPtu() {
		System.out.print("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Nhập các phần tử của mảng: \n");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = sc.nextInt();
		}
		System.out.print("Nhập phần tử k = ");
		int k = sc.nextInt();
		sortASC(arr);
		System.out.print("Sắp xếp mảng tăng dần: ");
		show(arr);
		System.out.printf("\nChèn phần tử %d vào mảng.", k);
		arr = insert(arr, k);
		System.out.print("\nMảng sau khi chèn: ");
		show(arr);
	}

	public static void sortASC(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static int[] insert(int[] arr, int k) {
		int arrIndex = arr.length - 1;
		int tempIndex = arr.length;
		int[] tempArr = new int[tempIndex + 1];
		boolean inserted = false;

		for (int i = tempIndex; i >= 0; i--) {
			if (arrIndex > -1 && arr[arrIndex] > k) {
				tempArr[i] = arr[arrIndex--];
			} else {
				if (!inserted) {
					tempArr[i] = k;
					inserted = true;
				} else {
					tempArr[i] = arr[arrIndex--];
				}
			}
		}
		return tempArr;
	}

	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// Bai 9 Tìm tất cả các mảng nguyên (int) có tổng giá trị các phần tử bằng giá
	// trị đã cho bất kỳ
	public static void TimMangCon() {

		System.out.print("Nhập số phần tử của mảng: ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.print("Nhập các phần tử của mảng: \n");
		for (int i = 0; i < N; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = sc.nextInt();
		}
		System.out.println("Co san mang: " + Arrays.toString(arr));
		int x;
		System.out.println("Nhap x: ");
		x = sc.nextInt();

		int i = 0, j = 0;
		int sum = 0;
		while (i < N && j < N) {
			if (sum > x) {
				sum -= arr[i++];
			}

			if (sum == x) {
				System.out.println("Tim thay mang con");
				for (int k = i; k < j; k++)
					System.out.print(arr[k] + " ");
				return;
			}

			else if (sum < x)
				sum += arr[j++];

		}
		if (sum == x) {
			System.out.println("Tim thay mang con");
			for (int k = i; k < j; k++)
				System.out.print(arr[k] + " ");
			return;
		} else
			System.out.println("Khong tim thay mang con bang x!");
	}

	// Bai 10 Bài 10: Tìm tất cả các số nguyên tố trong một mảng nguyên đặt lên đầu
	// và có sắp xếp

	public static int ktrant(int n) {
		if (n < 2)
			return 0;
		else {
			for (int i = 2; i <= n / 2; i++)
				if (n % i == 0)
					return 0;
			return 1;
		}
	}

	public static void TimNgto() {
//		int arr[] = { 20, 5, 3, 16, 2, 18, 19 };
		System.out.print("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Nhập các phần tử của mảng: \n");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> listTrue = new ArrayList<Integer>();
		ArrayList<Integer> listFalse = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("=> Mang: " + Arrays.toString(arr));

		for (int i : arr) {
			if (ktrant(i) == 1)
				listTrue.add(i);
			else
				listFalse.add(i);
		}
		System.out.print("Các số nguyên tố có trong mảng là: ");
		for (int i : listTrue) {
			System.out.print(i + " ");
		}
		// sx tăng
		listTrue.sort((o1, o2) -> o1 - o2);
		list.addAll(listTrue);
		list.addAll(listFalse);
		System.out.print("\nCác số nguyên tố trong mảng lên đầu sắp xếp tăng: ");
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		list.clear();

		// sx giảm
		listTrue.sort((o1, o2) -> o2 - o1);
		list.addAll(listTrue);
		list.addAll(listFalse);
		System.out.print("Các số nguyên tố trong mảng lên đầu sắp xếp giảm: ");
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
