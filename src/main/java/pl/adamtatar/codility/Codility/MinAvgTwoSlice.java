package pl.adamtatar.codility.Codility;

public class MinAvgTwoSlice {

	public static int solution(int[] A) {

		if (A.length < 2) {
			return -1;
		}
		if (A.length == 2) {
			return 0;
		}
		int index = 0;
		double min = Integer.MAX_VALUE;
		int sum = 0;
		double count = 0.0;
		int result = 0;

		for (index = 0; index < A.length; index++) {

			sum=0;
			count=0;
			for (int j = index; j < A.length; j++) {

				sum += A[j];
				count++;
				if (count == 1) {
					continue;
				}
				if (sum / count < min) {
					min = sum / count;
					result = index;
				} else {
					break;
				}

			}

		}
		return result;

	}

	public static void main(String[] args) {

		int[] A = { 123, 213, 4, 2, 2, 5, 1, 5, 8 };
		int[] B = { -3, -5, -8, -4, -10 };
		System.out.println(solution(B));

	}

}
