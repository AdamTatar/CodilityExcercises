package pl.adamtatar.codility.Codility;

import java.util.Arrays;

public class PermMissingElem {

	public static int solution(int[] A) {

		if (A.length == 0) {
			return 1;
		}
		if (A.length == 1 && A[0] == 1) {
			return 2;
		}

		if (A.length == 1 && A[0] == 2) {
			return 1;
		}

		Arrays.sort(A);
		int[] B = new int[A.length];
		for (int i = 0; i < B.length; i++) {
			B[i] = i + 1;
		}

		int i = 0;
		for (i = 0; i < B.length; i++) {
			if (A[i] != B[i]) {
				return B[i];
			}
		}
		return B[i - 1] + 1;
	}
 
	public static void main(String[] args) {
		// int[] A = { 1, 2, 5, 6, 3 };
		int[] A = {};
		System.out.println(solution(A));
	}
}
