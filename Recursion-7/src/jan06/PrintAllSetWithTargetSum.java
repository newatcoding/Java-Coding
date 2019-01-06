package jan06;

import java.util.ArrayList;

public class PrintAllSetWithTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		String str = "";
		String str1 = "";
		int[] arr1={10,20,30,40,50,60,70};
//		TargetSum(arr, 0, str, 50, 0);
//		targetsum(arr, 0, new ArrayList<>(), 50, 0);
		TargetOfAll(arr1, 0, str1, str, 0, 0);
		TargetOfAllArrLst(arr1, 0,new ArrayList<>(),new ArrayList<>(), 0, 0);

	}

	public static void TargetSum(int[] arr, int vidx, String str, int target, int sumofset) {
		if (vidx == arr.length) {
			if (sumofset == target) {
				System.out.println(str);
			}
			return;

		}

		TargetSum(arr, vidx + 1, str, target, sumofset);
		TargetSum(arr, vidx + 1, str + " " + arr[vidx], target, sumofset + arr[vidx]);

	}

	public static void targetsum(int[] arr, int vidx, ArrayList<Integer> str, int target, int sumofset) {
		if (vidx == arr.length) {
			if (sumofset == target) {
				System.out.println(str);
			}
			return;

		}

		targetsum(arr, vidx + 1, str, target, sumofset);
		str.add(arr[vidx]);
		targetsum(arr, vidx + 1, str, target, sumofset + arr[vidx]);
		str.remove(str.size() - 1);
	}

	public static void TargetOfAll(int[] arr, int vidx, String str1, String str2, int sumofset1, int sumofset2) {

		if (vidx == arr.length) {
			if (sumofset1 == sumofset2) {
				System.out.println(str1 + "       " + str2);
			}
			return;
		}
		TargetOfAll(arr, vidx + 1, str1, str2 + " " + arr[vidx], sumofset1, sumofset2 + arr[vidx]);
		TargetOfAll(arr, vidx + 1, str1 + " " + arr[vidx], str2, sumofset1 + arr[vidx], sumofset2);
	}
	public static void TargetOfAllArrLst(int[] arr, int vidx, ArrayList<Integer> str1, ArrayList<Integer> str2, int sumofset1, int sumofset2) {

		if (vidx == arr.length) {
			if (sumofset1 == sumofset2) {
				System.out.println(str1 + "       " + str2);
			}
			return;
		}
		str1.add(arr[vidx]);
		TargetOfAllArrLst(arr, vidx + 1, str1, str2, sumofset1, sumofset2 + arr[vidx]);
		str1.remove(str1.size()-1);
		str2.add(arr[vidx]);
		TargetOfAllArrLst(arr, vidx + 1, str1, str2, sumofset1 + arr[vidx], sumofset2);
		str2.remove(str2.size()-1);
	}

}
