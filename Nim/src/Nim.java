import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Nim {

	static Scanner in = new Scanner(System.in);
	static boolean flag = true;

	public static void main(String[] args) {
		ArrayList<Integer> piles = new ArrayList<Integer>();
		ArrayList<Integer> pilesCopy = null;
		Random rn = new Random();
		char player;

		do {
			player = '1';

			if (reset()) {
				for (int i = (rn.nextInt(4) + 2); i > 0; i--)
					piles.add(rn.nextInt(9) + 1);
				pilesCopy = copyList(piles);
			} else
				piles = copyList(pilesCopy);

			printPiles(piles);

			while (!checkWin(piles, player)) {
				playerMove(piles, player);
				printPiles(piles);
				player = player == '1' ? '2' : '1';
			}
		} while (playNext());
	}

	public static boolean reset() {
		if (flag) {
			flag = false;
			return true;
		} else {
			System.out.println("Do you want to play the same game again? (y/n)");
			char ans = in.next().charAt(0);

			if (ans == 'y')
				return false;
			else
				return true;
		}
	}

	public static ArrayList<Integer> copyList(ArrayList<Integer> list) {
		ArrayList<Integer> newList = new ArrayList<Integer>();

		for (int e : list)
			newList.add(e);

		return newList;
	}

	public static void playerMove(ArrayList<Integer> piles, char player) {
		int pile, amount;
		System.out.println("Player " + player + " moves");
		do {
			System.out.println("Choose a pile (make sure you enetered valid value)");
			pile = in.nextInt() - 1;
		} while (!(pile >= 0 && pile < piles.size() && piles.get(pile) > 0));

		do {
			System.out.println("How many sticks do you want to remove? (make sure you enetered valid value)");
			amount = in.nextInt();
		} while (!(amount > 0 && amount <= piles.get(pile)));

		piles.set(pile, piles.get(pile) - amount);

	}

	public static void printPiles(ArrayList<Integer> piles) {
		for (int e : piles) {
			for (int i = e; i > 0; i--)
				System.out.print("|");
			System.out.println("");
		}
	}

	public static boolean checkWin(ArrayList<Integer> piles, char player) {
		for (int e : piles)
			if (e > 1)
				return false;
		System.out.println("Player " + player + "has won!");
		return true;
	}

	public static boolean playNext() {
		System.out.println("Do you want to play next game? (y/n)");
		char ans = in.next().charAt(0);

		if (ans == 'y')
			return true;
		else
			return false;
	}
}
