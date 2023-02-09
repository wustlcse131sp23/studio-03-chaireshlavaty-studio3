package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Number of Values to Sieve: ");
		int n = in.nextInt();

		boolean[] sieve = new boolean[n + 1];

		for (int i = 2; i < Math.sqrt(n); i++) {

			if (sieve[i] == false) {

				for (int j = 2; j < n; j++) {

					if (j % i == 0) {
						sieve[j] = true;
						if (j == i) {
							sieve[j] = false;
						}

					}
				}

			}
		}
		for (int i1 = 2; i1 < n; i1++) {
			if (sieve[i1] == false) {
				System.out.print(i1 + " ");
			}
		}
	}
}