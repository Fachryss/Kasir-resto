import java.util.Scanner;

public class KASIRRESTORAN {
    public static void main(String[] args) {
        System.out.println("Menu Makanan");
        System.out.println("1.Soto Ayam (15000)");
        System.out.println("2.Rawon Daging (17000)");
        System.out.println("3.Mie Goreng (5000)");
        System.out.println("4.Tahu Telor (8000)");
        System.out.println("5.Sate Kambing (20000)");

        int soto, rawon, mie, tahu, sate;
        soto = 15000;
        rawon = 17000;
        mie = 5000;
        tahu = 8000;
        sate = 20000;

        int jumlahBeli, total, bayar, kembali;

        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah beli: ");
        jumlahBeli = input.nextInt();
        total = jumlahBeli*soto;
        System.out.println("Total Pembelian:" + total);
        System.out.println("Masukkan Pembayaran:");
        bayar = input.nextInt();
        kembali = bayar - total;
        System.out.println("Jumlah Kembalian:" + kembali);
    }

}
