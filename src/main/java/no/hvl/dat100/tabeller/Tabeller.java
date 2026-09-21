package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		int length = tabell.length;

		System.out.print("[");
		if (length == 0) {
			System.out.println("]");
		}
		for (int i = 0; i < length; i++) {
			if (i != (length - 1)) {
				System.out.print(tabell[i] + ", ");
			} else {
				System.out.print(tabell[i] + "]");
			}
		}
	}

	// 	b)
	public static String tilStreng(int[] tabell) {
		String resultat = "[";

		for (int i = 0; i < tabell.length; i++) {
			resultat += tabell[i];

			if (i != tabell.length - 1) {
				resultat += ",";
			}
		}

		resultat += "]";
		System.out.println(resultat);
		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {
		int resultat = 0;

		for (int i = 0; i < tabell.length; i++) {
			resultat += tabell[i];
		}
		System.out.println(resultat);
		return resultat;
		}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean resultat = false;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				resultat = true;
			}
		}
		return  resultat;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int resultat = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				resultat = i;
			}
		}
		return resultat;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int length = tabell.length;
		int[] resultat = new int[length];

		for (int i = 0; i < length; i++) {
			resultat[i] = tabell[length - i - 1];
		}
		return resultat;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean resultat = true;
		int length = tabell.length;

		for (int i = 0; i < length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				resultat = false;
			}
		}
		return resultat;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] resultat = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			resultat[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			resultat[i + tabell1.length] = tabell2[i];
		}
		return resultat;
	}
}
