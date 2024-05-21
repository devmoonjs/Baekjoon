import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
		Arrays.sort(B);
		
		int j = A.length - 1;
		int sum = 0;
		int answer = 0;
		
		for (int i = 0; i < A.length; i++) {
			sum = A[i] * B[j];
			answer += sum;
			j--;
		}
		
		return answer;
		
	}
}