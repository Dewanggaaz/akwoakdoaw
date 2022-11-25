package com.example.Tugasviewandviews;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.Tugasviewandviews.R;

public class MovetoBeli extends AppCompatActivity{
    public  static final String EXTRA_NAMA = "extra_nama";
    public  static final String EXTRA_DESKRIPSI = "extra_deskripsi";
    public  static final String EXTRA_GAMBAR = "extra_gambar";
    public  static final String EXTRA_HARGA = "extra_harga";
    public static final String EXTRA_JUMLAH = "extra_jumlah";

    private TextView tvNama, tvDeskripsi, tvHarga, tvJumlah;
    private String nama, deskripsi, harga, jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movetobeli);

        tvNama = findViewById(R.id.tv_name);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);
        tvHarga = findViewById(R.id.tv_harga);
        tvJumlah = findViewById(R.id.tv_jumlah);

        nama = getIntent().getStringExtra(EXTRA_NAMA);
        deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        harga = getIntent().getStringExtra(EXTRA_HARGA);
        jumlah = getIntent().getStringExtra(EXTRA_JUMLAH);

        tvNama.setText(nama);
        tvDeskripsi.setText(deskripsi);
        tvHarga.setText(harga);
        tvJumlah.setText(jumlah);
    }
}
