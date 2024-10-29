import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		String[] 
		int masaStudi = input.nextInt();
		int nilaiIpk = input.nextInt();
		int ePrt = input.nextInt();

		String statusHki = input.nextLine();
		String lombaInternasional = input.nextLine();

		if(masaStudi > 3.0 || nilaiIpk > 3.5 || ePrt >= 450) {
			System.out.println("Cumlaude");
		} else if(masaStudi < 3.0 || nilaiIpk < 3.5 || ePrt < 450) {
			System.out.println("Tidak Cumlaude");
		} 
	}
}
