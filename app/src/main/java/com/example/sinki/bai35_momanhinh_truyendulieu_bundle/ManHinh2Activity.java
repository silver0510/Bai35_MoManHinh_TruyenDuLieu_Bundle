package com.example.sinki.bai35_momanhinh_truyendulieu_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sinki.model.SanPham;

public class ManHinh2Activity extends AppCompatActivity {
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);
        addControls();
    }

    private void addControls() {
        txtKetQua = (TextView) findViewById(R.id.txtKetQua);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        SanPham sp = (SanPham) bundle.getSerializable("sp");
        txtKetQua.setText("x = "+bundle.getInt("X") + "\n" +
                          "d = "+bundle.getDouble("D")+ "\n" +
                        "sp = " + sp);
    }
}
