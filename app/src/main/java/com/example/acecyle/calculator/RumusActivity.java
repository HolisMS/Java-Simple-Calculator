package com.example.acecyle.calculator;

import android.content.Intent;
import android.provider.Contacts;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class RumusActivity extends Fragment {
    TextView teks1, teks2, teks3, teks4, teks5, teks6, teks7, teks8;
    TextView title1, title2, title3, title4, title5, title6, title7, title8;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedIntanceState){
        View view = inflater.inflate(R.layout.activity_rumus, container, false);

        teks1 = view.findViewById(R.id.teks1);
        teks2 = view.findViewById(R.id.teks2);
        teks3 = view.findViewById(R.id.teks3);
        teks4 = view.findViewById(R.id.teks4);
        teks5 = view.findViewById(R.id.teks5);
        teks6 = view.findViewById(R.id.teks6);
        teks7 = view.findViewById(R.id.teks7);
        teks8 = view.findViewById(R.id.teks8);

        title1 = view.findViewById(R.id.title1);
        title2 = view.findViewById(R.id.title2);
        title3 = view.findViewById(R.id.title3);
        title4 = view.findViewById(R.id.title4);
        title5 = view.findViewById(R.id.title5);
        title6 = view.findViewById(R.id.title6);
        title7 = view.findViewById(R.id.title7);
        title8 = view.findViewById(R.id.title8);


        title1.setText("Konversi Satuan");
        teks1.setText("Rumus panjang : kilometer, hektometer, dekameter, meter, desimeter, centimeter, milimeter\n" +
                "\n" +
                "*Dalam menggunakan rumus ini jika memindahkan konversi satuan naik maka rumusnya adalah nilai : 10 = hasil\n" +
                "*Jika konversi satuan turun maka rumusnya adalah nilai x 10 = hasil");

        title2.setText("Satuan Berat Dan Satuan Waktu");
        teks2.setText("*Satuan Berat\n" +
                "1 ton = 1000 kg\n" +
                "1 ton = 10 kwintal\n" +
                "1 kwintal = 100 kg\n" +
                "1 kg = 10 ons\n" +
                "1 kg = 2 pon\n" +
                "1 pon = 5 ons\n" +
                "1 pon = 500 gram\n" +
                "1 ons = 100 gram\n"+
                "*Satuan Waktu\n" +
                "1 tahun = 52 minggu = 365 hari\n" +
                "1 bulan = 4 minggu = 30/31 hari\n" +
                "1 minggu = 7 hari = 168 jam\n" +
                "1 tahun = 4 triwulan = 2 semester\n" +
                "1 windu = 8 tahun = 96 bulan\n" +
                "1 abad = 100 tahun = 10 dasawarsa\n" +
                "1 milineum = 1000 tahun = 10 abad");

        title3.setText("Satuan Kuantitas");
        teks3.setText("1 lusin = 12 buah\n" +
                "1 gros = 12 lusin\n" +
                "1 gros = 144 buah\n" +
                "1 kondi = 20 lembar\n" +
                "1 rim = 500 lembar");

        title4.setText("Rumus Kecepatan");
        teks4.setText("Kecepatan = jarak : waktu\n" +
                "Jarak = kecepatan x waktu\n" +
                "Waktu = jarak : kecepatan");

        title5.setText("Rumus Debit");
        teks5.setText("Debit = volume : waktu\n" +
                "Volume = debit x waktu\n" +
                "Waktu = volume : debit");

        title6.setText("Rumus Skala");
        teks6.setText("Skala = Jarak sebenarnya : jarak pada peta\n" +
                "Jarak sebenarnya = skala x jarak pada peta (dijadikan satuan km)\n" +
                "Jarak pada peta = jarak sebenarnya : skala");

        title7.setText("Luas Bangun Datar");
        teks7.setText("Persegi = s x s, kelilingnya 4 x s\n" +
                "Persegi panjang = p x l, kelilingnya 2 x (p x l)\n" +
                "Segitiga = ½ x alas x t\n" +
                "Jajar genjang = alas x t\n" +
                "Trapesium = ½ (a+b) x t");

        title8.setText("Rumus Volume Bangunan");
        teks8.setText("Kubu = s x s x s, luas permukaan 6 x s²\n" +
                "Balok = p x l x t, luas permukaan 2( p x l + p x t + l x t)\n" +
                "Prisma segitiga = L alas x t, luas permukaan ( 2 x luas alas) + ( t x keliling alas)\n" +
                "Limas segiempat = ? x alas x tinggi, luas permukaan s x s + 4(luas segitiga)\n");

        return view;
    }
}
