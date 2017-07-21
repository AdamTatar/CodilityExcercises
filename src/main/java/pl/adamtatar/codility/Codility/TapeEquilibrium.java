package pl.adamtatar.codility.Codility;

import java.util.stream.IntStream;

public class TapeEquilibrium {

	public static void main(String[] args) {

		int[] A = { 2, 5, 34, 16, 1, -4 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

		if (A.length == 2) {
			return Math.abs(A[0] - A[1]);
		}
		int left = 0;
		int right = IntStream.of(A).sum();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			left += A[i];
			right -= A[i];
			if (Math.abs(left - right) < min) {
				min = Math.abs(left - right);
			}
		}
		return min;
	}
}
