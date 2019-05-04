import java.util.Scanner;
public class pibo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] num = new long[91];
		num[0] = 0;
		num[1] = 1;
		for (int i = 0; i < 91; i++) {
			if(i >=  2 ) {
				num[i] = num[i-1] + num[i-2];
			}
		}
		System.out.println(num[n]);
	}
}