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

		String result = "";

		for (int[] table : matrise) {

			for (int i = 0; i < table.length; i++) {

				result += table[i];
				if (i != table.length - 1) {
					result += " ";
				}

			}

			result += "\n";
		}

		return result;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] result = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				result[i][j] = matrise[i][j]*tall;
			}
		}

		return result;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}

		return true;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] result = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				result[i][j] = matrise[j][i];
			}
		}

		return result;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] result = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < b[0].length; j++) {
				sum += (a[i][j] * b[j][i]);
			}
			result[i][i] = sum;
		}

		return result;
	
	}
}
