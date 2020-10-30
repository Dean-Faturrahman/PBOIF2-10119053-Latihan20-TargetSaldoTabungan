/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan20.targetsaldotabungan;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menghitung saldo target
 */
public class PBOIF210119053Latihan20TargetSaldoTabungan {

    public static void main(String[] args) {
        double bunga, saldo, saldoAwal, saldoAkhir, saldoTarget;

        saldoAwal = 3500000;
        bunga = 8;
        saldoTarget = 6000000;
        saldoAkhir = 0;

        for (int i = 1; saldoAkhir <= saldoTarget; i++) {
            saldo = saldoAwal * bunga / 100;
            saldoAkhir = saldo + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " Rp.%,1.0f%n", saldoAkhir);
            saldoAwal += saldo;
        }
    }
    
}
