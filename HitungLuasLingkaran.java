import java.util.Scanner;

public class HitungLuasLingkaran {
    public static void main(String[] args) {
        double jariJari, luas;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        jariJari = scanner.nextDouble();

        luas = Math.PI * jariJari * jariJari;

        System.out.println("Luas lingkaran adalah " + luas);
    }
}
