package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		int lengthMatrix = matrise.length;

		System.out.print("[");
		if (lengthMatrix == 0) {
			System.out.println("]");
		}

        for (int i = 0; i < lengthMatrix; i++) {
			int[] table = matrise[i];
            int lengthTable = table.length;

            System.out.print("[");
            for (int j = 0; j < lengthTable; j++) {
                if (j != (lengthTable - 1)) {
                    System.out.print(table[j] + ", ");
                } else {
                    System.out.print(table[j] + "]");
                }
            }

			if (i != (lengthMatrix - 1)) {
				System.out.print(", ");
			} else {
				System.out.print("]");
			}
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
