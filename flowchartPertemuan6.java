import java.util.Scanner;

public class flowchartPertemuan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double hargaBuku, diskon = 0, totalHarga, totalDiskon, hargaSetelahDiskon;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlahBuku = sc.nextInt();
        System.out.print("Masukkan harga satuan buku: ");
        hargaBuku = sc.nextDouble();

        diskon = 0;
        totalHarga = hargaBuku * jumlahBuku;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }

        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }

        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }

        totalDiskon = totalHarga * diskon;
        hargaSetelahDiskon = totalHarga - totalDiskon;

        System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
        System.out.println("Total diskon yang didapat: Rp " + totalDiskon);
        System.out.println("Total harga setelah diskon: Rp " + hargaSetelahDiskon);

        sc.close();
    }
}
