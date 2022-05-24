package com.example.bagas_pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_panjang, et_lebar;
    private Button btn_hitung;
    private TextView tv_hasil;
    private double luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Bagas Gilang_Pertemuan3");
        et_panjang = (EditText) findViewById(R.id.edt_panjang);
        et_lebar = (EditText) findViewById(R.id.edt_lebar);
        btn_hitung = (Button) findViewById(R.id.btn_hitung);
        tv_hasil = (TextView) findViewById(R.id.tv_hasil);

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    double panjang = Double.valueOf(et_panjang.getText().toString());
                    double lebar = Double.valueOf(et_lebar.getText().toString());

                    luas = panjang * lebar;

                    tv_hasil.setText("Luas : "+luas);

                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}