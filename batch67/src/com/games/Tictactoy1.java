package com.games;

import java.util.Scanner;

public class Tictactoy1 {
	static char[][] c = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char player = 'X';

	public static void board() {
		System.out.println("------------------");
		for (char[] a2 : c) {
			System.out.print("  ");
			for (char a1 : a2) {
				System.out.print(a1 + " | ");
			}
			System.out.println();
			System.out.println("----------------");
		}
	}

	public static boolean iswin() {
		for (int i = 0; i < 3; i++) {
			if (c[i][0] == player && c[i][1] == player && c[i][2] == player) {
				return true;
			}
			if (c[0][i] == player && c[1][i] == player && c[2][i] == player) {
				return true;
			}
			if (c[0][0] == player && c[1][1] == player && c[2][2] == player) {
				return true;
			}
			if (c[2][0] == player && c[1][1] == player && c[0][2] == player) {
				return true;
			}
		}
		return false;
	}

	public static boolean isdraw() {
		for (char[] c2 : c)
			for (char c1 : c2)
				if (c1 == ' ')
					return false;

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;{
			boolean flag = true;
			while (flag) {
				board();
				System.out.println("enter a row:" + player);
				int row = sc.nextInt();
				System.out.println("enter a col:" + player);
				int col = sc.nextInt();
				if (row < 0 || row > 2 || col < 0 || col > 2 || c[row][col] != ' ') {
					System.out.println("invalid ");
					System.out.println("try again");
					continue;
				}
				c[row][col] = player;
				if (iswin()) {
					System.out.println("====================================");
					board();
					System.out.println("you won the game:" + player);
					break;
				}
				if (isdraw()) {
					board();
					System.out.println("draw match");

				}
				player = (player == 'X') ? 'O' : 'X';

			}

		}

	}
	      

}
