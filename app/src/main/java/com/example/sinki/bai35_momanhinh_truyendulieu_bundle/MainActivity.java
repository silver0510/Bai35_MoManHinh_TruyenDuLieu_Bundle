package com.example.sinki.bai35_momanhinh_truyendulieu_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sinki.model.SanPham;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoVaGoiDuLieu(View view) {
        Intent intent = new Intent(MainActivity.this,ManHinh2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("X",113);
        bundle.putDouble("D",112.767);
        SanPham coca = new SanPham(1,"cocacola",15000.0);
        bundle.putSerializable("sp",coca);

        intent.putExtra("bundle",bundle);
        startActivity(intent);
    }
}
