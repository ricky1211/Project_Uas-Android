package com.hello.rickkyyapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.hello.rickkyyapps.alarm.ActivityAlarm;
import com.hello.rickkyyapps.fragment.ViewPagerActivity;


public class HomeMainActivity extends AppCompatActivity {
    CardView tombolSatu;
    CardView tombolDua;
    CardView tombolTiga;
    CardView tombolEmpat;
    CardView tombolLima;
    CardView tombolEnam;
    CardView tombolTujuh;
    CardView tombolDelapan;
    CardView tombolSembilan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // inisialisasi view
        View decorView = getWindow().getDecorView();
        // hide the status bar
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        tombolSatu = findViewById(R.id.cdMenu1);

        tombolSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolSatu ditekan, pindah ke HelloActivity
                Intent intent = new Intent(HomeMainActivity.this, MainHelloActivity.class);
                startActivity(intent);
            }
        });

        tombolDua = findViewById(R.id.cdMenu2);
        tombolDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(HomeMainActivity.this, MainCount.class);
                startActivity(intent);
            }
        });

        tombolTiga = findViewById(R.id.cdMenu3);
        tombolTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(HomeMainActivity.this, ScrollingIceCold.class);
                startActivity(intent);
            }
        });

        tombolEmpat = findViewById(R.id.cdMenu4);
        tombolEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(HomeMainActivity.this, ActivityAlarm.class);
                startActivity(intent);
            }
        });

        tombolLima = findViewById(R.id.cdMenu5);
        tombolLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(HomeMainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        tombolEnam = findViewById(R.id.cdMenu6);
        tombolEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(HomeMainActivity.this, MainActivityOne.class);
                startActivity(intent);
            }
        });

        tombolTujuh = findViewById(R.id.cdMenu7);
        tombolTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(HomeMainActivity.this, ActivityMap.class);
                startActivity(intent);
            }
        });

        tombolDelapan = findViewById(R.id.cdMenu8);
        tombolDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeMainActivity.this, ViewPagerActivity.class);
                startActivity(intent);
            }
        });

        tombolSembilan = findViewById(R.id.cdMenu9);
        tombolSembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombolDua ditekan, lakukan aksi yang diinginkan
                // Misalnya, pindah ke aktivitas lain atau jalankan fungsi khusus
                Intent intent = new Intent(HomeMainActivity.this, MainHelloActivity.class);
                startActivity(intent);
            }
        });

    }
}