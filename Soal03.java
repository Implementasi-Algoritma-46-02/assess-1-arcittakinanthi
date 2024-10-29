import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		int H = input.nextInt();
		int M = input.nextInt();
		int V = input.nextInt();

		System.out.println(jam(H, M, V));
	}

	private static String jam(int H, int M, int V) {

		int countTime = M + V;

		if (countTime >+ 60) {
			countTime %= 60;

		return ""H & M" + (karena + "H & M" + ditambah "V" menit = "H & M + V"))"
		} 
	}
}
