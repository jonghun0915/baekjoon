import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < M; i++) {
			int I = scan.nextInt();
			int J = scan.nextInt();
			int K = scan.nextInt();
			
			for (int j = I - 1; j < J; j++) {
				arr[j] = K;
			}
			
			
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}