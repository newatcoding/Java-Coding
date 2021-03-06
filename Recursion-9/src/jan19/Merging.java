package jan19;

public class Merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] one={1,3,5,6,7};
		// int[] two={2,8,9};
		int[] arr = { 1, 5, 3, 8, 9, 6, 7, 2 };
		// int[] arr1=mergtwosortedarray(one,two);
		int[] newarr = merging(arr, 0, arr.length - 1);
		display(newarr);
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static int[] mergtwosortedarray(int[] one, int[] two) {
		int[] arr = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				arr[k] = one[i];
				i++;
				k++;
			} else  {
				arr[k] = two[j];
				j++;
				k++;
			}

		}
		while (i < one.length) {
			arr[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			arr[k] = two[j];
			j++;
			k++;
		}

		return arr;

	}

	public static int[] merging(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] basearr = new int[1];
			basearr[0] = arr[lo];
			return basearr;
		}
		int mid = (lo + hi) / 2;
		int[] lefthalf = merging(arr, lo, mid);
		int[] righthalf = merging(arr, mid + 1, hi);
		int[] mergedarr = mergtwosortedarray(lefthalf, righthalf);
		return mergedarr;
	}

}
