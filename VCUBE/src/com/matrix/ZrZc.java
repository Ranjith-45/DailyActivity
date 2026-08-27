package com.matrix;

public class ZrZc {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9 } };
		int[][] b = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i][j] = a[i][j];
			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] == 0) {
					for (int k = 0; k <= a.length - 1; k++) {
						b[i][k] = 0;
						b[k][j] = 0;
					}
				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
