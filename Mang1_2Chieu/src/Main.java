import java.util.Arrays;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[] { 1, 2, 3 };
		int arr2[] = { 4, 5, 6 };
		int arr3[] = { 7, 8, 9, 10 };

		// ghep mang 1 chieu -> 2 chieu
		int arr[][] = { arr1, arr2, arr3 };

		// In mang 2 chieu
		// cach 1:
		for (int[] row : arr) {
			for (int i : row) {
				System.out.print(i);
			}
			System.out.println();
		}
		// cach 2:
		System.out.println(Arrays.deepToString(arr)); // mang 2 chieu deepToString

		// Hop 2 mang 1 chieu
		Integer[] arrInt1 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
		Integer[] arrInt2 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
		HashSet<Integer> set = new HashSet<>();
		set.addAll(Arrays.asList(arrInt1));
		set.addAll(Arrays.asList(arrInt2));
		System.out.println(set);
		// chuyen ve mang
		Integer[] union = {};
		union = set.toArray(union);
		System.out.println(Arrays.toString(union));
		System.out.println(union[2]);
		// Giao 2 mang
		arrInt1 = new Integer[] { 0, 1, 2, 3, 4, 5, 7 };
		arrInt2 = new Integer[] { 1, 4, 5, 10, 9 };
		HashSet<Integer> set2 = new HashSet<>();
		set2.addAll(Arrays.asList(arrInt1));
		set2.retainAll(Arrays.asList(arrInt2));

		System.out.print("giao 2 mang: ");
		System.out.println(set2);

		// Tao 1 chuoi tu mang k? tu
		char[] arrChar = { 'H', 'e', 'l', 'l', 'o', };
		String s = String.valueOf(arrChar);
		System.out.println(s);

		// cat string thanh mang string[]
		String s1 = "Vu Van Khanh";
		String arrS1[] = s1.split(" ");
		System.out.println(Arrays.toString(arrS1));

		// ghet mang string[] -> string
		String s2 = String.join("-", arrS1);
		System.out.println(s2);

		// trong bo nho
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2)); // -> so sanh gia tri
		System.out.println(str1 == str2); // -> so sanh dia chi o nho
	}

}
