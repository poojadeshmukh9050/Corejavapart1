package StartPattern;

import java.util.Scanner;

public class Righttraingle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no :");
		int n = sc.nextInt();
		
		for (int r = 1; r <= n; r++){

			for (int s = n; s >= r; s--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
