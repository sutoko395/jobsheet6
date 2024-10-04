import java.util.Scanner;
/**
 * Pemilihan2Percobaan223
 */
public class Pemilihan2Percobaan223 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan_menu, harga = 0;
        double diskon = 0, total_bayar=0;
        String member, metode_pembayaran;

        System.out.println("_______________________");
        System.out.println("=====MENU KAFE JTI=====");
        System.out.println("_______________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("_____________________________________");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = sc.nextInt();
        sc.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = sc.nextLine();
        System.out.println("_____________________________________");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea" + harga);

            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling =" + harga);

            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }
                
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea" + harga);

            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling =" + harga);

            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.print("Apakah ingin membayar dengan QRIS (y/n)? ");
        metode_pembayaran = sc.nextLine();

        if (metode_pembayaran.equalsIgnoreCase("y")) {
            total_bayar -= 1000;
            System.out.println("Anda mendapatkan potongan Rp. 1.000 untuk pembayaran melalui QRIS.");
        }

        System.out.println("Total bayar setelah pembayaran: " + total_bayar);
        System.out.println("_____________________________________");          
        sc.close();
    }
}