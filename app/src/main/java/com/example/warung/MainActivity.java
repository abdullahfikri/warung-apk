package com.example.warung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
    public void btnBayar(View view){
        RadioGroup kopiGroup, menuGroup;
        RadioButton kopiButton, makananButton;
        CheckBox cream, sugar ;


        // Kopi Button
        kopiGroup = (RadioGroup) findViewById(R.id.kopiGroup);
        int selectedIdKopi = kopiGroup.getCheckedRadioButtonId();
        kopiButton = (RadioButton) findViewById(selectedIdKopi);

        // Checked Button
        int hargaCream = 0;
        int sugarHarga = 0;
        cream = (CheckBox) findViewById(R.id.cbCream);
        sugar = (CheckBox) findViewById(R.id.cbSugar);
        if(cream.isChecked()){
            hargaCream = 1000;
        }
        if(sugar.isChecked()){
            sugarHarga = 500;
        }





        // Makanan Button
        menuGroup = (RadioGroup) findViewById(R.id.menuGrup);
        int selectedIdMakanan = menuGroup.getCheckedRadioButtonId();
        makananButton = (RadioButton) findViewById(selectedIdMakanan);


        String kopiPesanan = kopiButton.getText().toString().trim();
        String makananPesanan = makananButton.getText().toString().trim();

        int hargaKopi= 0;
        int hargaMenu = 0;

        switch (kopiPesanan){
            case "Kopi Robusta":
                hargaKopi = 20000;
                break;
            case "Expresso":
                hargaKopi = 25000;
                break;
            case "Kopi Luwak":
                hargaKopi = 30000;
                break;
            default:
                hargaKopi = 0;
        }

        switch (makananPesanan) {
            case "Nasi Goreng":
                hargaMenu = 10000 ;
                break;
            case  "Mie Goreng":
                hargaMenu = 12000;
            break;
            case "Mie Rebus":
                hargaMenu = 14000;
                break;
            default:
                hargaMenu = 0;
        }

        TextView tvPembayaran = (TextView) findViewById(R.id.pembayaran);

        tvPembayaran.setText("" + (hargaKopi+hargaMenu + sugarHarga + hargaCream));










    }
}