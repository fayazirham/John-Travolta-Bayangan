package com.uts;
import org.springframework.stereotype.Service;

@Service
public class JohnTravoltaLogicService {

    // Program 1: Perhitungan Gaji dan Tabungan John Travolta
    public String hitungGajiTravolta(int jamKerja, double pengeluaran) {
        double rateNormal = 15000.0;
        double rateLembur = rateNormal * 1.5;

        double gajiNormal = 0;
        double gajiLembur = 0;

        // Logika jam kerja
        if (jamKerja <= 40) {
            gajiNormal = jamKerja * rateNormal;
        } else {
            gajiNormal = 40 * rateNormal;
            gajiLembur = (jamKerja - 40) * rateLembur;
        }

        double totalGaji = gajiNormal + gajiLembur;

        // Membangun pesan hasil perhitungan
        StringBuilder hasil = new StringBuilder();
        hasil.append(String.format("1) Total Gaji (Kerja %d jam): <b>Rp %,.0f</b> (Gaji Pokok: Rp %,.0f + Lembur: Rp %,.0f).<br><br>",
                jamKerja, totalGaji, gajiNormal, gajiLembur));

        // Logika tabungan
        if (totalGaji > pengeluaran) {
            double tabungan = totalGaji - pengeluaran;
            hasil.append(String.format("2) Mr. John <b>BISA</b> menabung. Besar tabungannya minggu ini adalah <b>Rp %,.0f</b>.", tabungan));
        } else if (totalGaji == pengeluaran) {
            hasil.append("2) Mr. John <b>TIDAK BISA</b> menabung. Gajinya pas-pasan untuk menutupi pengeluaran.");
        } else {
            hasil.append("2) Mr. John <b>TIDAK BISA</b> menabung. Gajinya kurang untuk menutupi pengeluaran minggu ini.");
        }

        return hasil.toString();
    }

    // Program 2: Perhitungan Persamaan Kuadrat
    public String hitungAkarKuadrat(double a, double b, double c) {
        if (a == 0) {
            return "Bukan persamaan kuadrat (nilai 'a' tidak boleh 0).";
        }

        double d = (b * b) - (4 * a * c);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            return String.format("Diskriminan > 0. Memiliki 2 akar nyata berbeda: x1 = %.2f dan x2 = %.2f", x1, x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            return String.format("Diskriminan = 0. Memiliki akar kembar: x1 = x2 = %.2f", x);
        } else {
            return "Diskriminan < 0. Akar imajiner (tidak memiliki akar nyata).";
        }
    }
}