import java.util.Scanner;
/**
 * LeapYearChecker
 */
public class Pemilihan2Percobaan123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tahun;
        
        System.out.print("Masukkan tahun: ");
        tahun = sc.nextInt();
        
        int cek400 = tahun % 400;
        int cek100 = tahun % 100;
        int cek4 = tahun % 4;

        if (cek4 == 0) {
            if (cek100 == 0) {
                if (cek400 == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
        sc.close();
    }
}