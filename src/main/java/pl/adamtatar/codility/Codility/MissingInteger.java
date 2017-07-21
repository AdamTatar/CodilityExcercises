package pl.adamtatar.codility.Codility;

import java.util.stream.IntStream;

public class MissingInteger {

	public static void main(String[] args) {

		// int[] A = { 2, 5, 34, 16, 1, 3 -5, 3, 3, -5 };
		int[] A = { 1, 2 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

		int[] B = IntStream.of(A).distinct().filter(a -> a > 0).sorted().toArray();
		int i = 0;
		for (; i < B.length; i++) {
			if (B[i] != i + 1) {
				return i + 1;
			}
		}
		return i + 1;
	}

}
