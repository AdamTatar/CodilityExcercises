package pl.adamtatar.codility.Codility;

public class MinAvgTwoSlice {

	public static int solution(int[] A) {

		if (A.length < 2) {
			return -1;
		}
		if (A.length == 2) {
			return 0;
		}
		int a = A[0];
		int b = A[1];
		int min = (a + b) / 2;
		int position = 0;
		for (int i = 1; i < A.length - 1; i++) {
			a = A[i];
			b = A[i + 1];
			if ((a + b) / 2 < min) {
				min = (a + b) / 2;
				position = i;

					// starting with third element
				int j = i+2;
				int sum = A[j];
				int count = 1;
				
				for (; j < A.length; j++) {
					sum+=A[j];
					count++;
					if(sum/count < min){
						
					}
				}
				
				
				
				
			}
		}
		return position;

	}

	public static void main(String[] args) {

		int[] A = { 123, 213, 4, 2, 2, 5, 1, 5, 8 };
		int[] B = { -3, -5, -8, -4, -10 };
		System.out.println(solution(B));

	}

}
