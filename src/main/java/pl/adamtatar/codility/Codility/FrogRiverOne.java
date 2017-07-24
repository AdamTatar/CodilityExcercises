package pl.adamtatar.codility.Codility;

import org.apache.commons.lang3.ArrayUtils;

public class FrogRiverOne {

	public static int solution(int X, int[] A) {

		int result = -1;
		int index = -1;
		int i, j;
		for (i = 1; i <= X; i++) {
			for (j = 0; j < A.length; j++) {
				index = -1;
				if (A[j] == i) {
					index = j;
					break;
				}
			}
			// temp = ArrayUtils.indexOf(A, i);
			if (index == -1) {
				return -1;
			}
			if (result < index) {
				result = index;
				if (i == X) {
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 1, 1, 2, 3, 5, 4 };
		// int[] A = { 1,1,1,1};
		System.out.println(solution(5, A));
	}
}
// For example, given X = 5 and array A such that:
// A[0] = 1
// A[1] = 3
// A[2] = 1
// A[3] = 4
// A[4] = 2
// A[5] = 3
// A[6] = 5
// A[7] = 4
//
// the function should return 6, as explained above.