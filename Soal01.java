import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		String[] Split = input.nextLine().Split(" ");
		int num1 = Integer.parseInt(Split[0]);
		int num2 = Integer.parseInt(Split[1]);
		int num3 = Integer.parseInt(Split[2]);
		int num4 = Integer.parseInt(Split[3]);
		int num5 = Integer.parseInt(Split[4]);
		
		System.out.println(num1 + " " + validasi(num1));
		System.out.println(num2 + " " + validasi(num2));
		System.out.println(num3 + " " + validasi(num3));
		System.out.println(num4 + " " + validasi(num4));
		System.out.println(num5 + " " + validasi(num5));
		input.close();

	}

	private static String validasi(num1)


}
