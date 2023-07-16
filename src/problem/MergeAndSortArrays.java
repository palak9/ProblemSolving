package problem;

import java.util.Arrays;

public class MergeAndSortArrays {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int counter = 0;
		for (int j = m; j < m + n; j++) {
			nums1[j] = nums2[counter++];
		}

		Arrays.sort(nums1);
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}

	}

	public static void main(String[] args) {
		MergeAndSortArrays.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
	}
}
