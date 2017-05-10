package com.amccdev.ibas.dokterpuyuh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class diagnosa extends AppCompatActivity {

    private Button button;
    private CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9;
    private TextView textView, textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        button = (Button)findViewById(R.id.btnNext);
        cb1 = (CheckBox)findViewById(R.id.cek1);
        cb2 = (CheckBox)findViewById(R.id.cek2);
        cb3 = (CheckBox)findViewById(R.id.cek3);
        cb4 = (CheckBox)findViewById(R.id.cek4);
        cb5 = (CheckBox)findViewById(R.id.cek5);
        cb6 = (CheckBox)findViewById(R.id.cek6);
        cb7 = (CheckBox)findViewById(R.id.cek7);
        cb8 = (CheckBox)findViewById(R.id.cek8);
        cb9 = (CheckBox)findViewById(R.id.cek9);
        textView = (TextView)findViewById(R.id.txtHasil);
        textView1 = (TextView)findViewById(R.id.txtObat);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cb1.isChecked()){
                    if (cb2.isChecked() && cb3.isChecked())
                    {
                        textView.setText("Snot");
                        textView1.setText("Pemberian minum CRD");
                    }
                    else
                    {
                        textView.setText("Cacing Mata");
                        textView1.setText("Obat suntik cacing mata / dicampurkan diair minum");
                    }
                }
                else if (cb5.isChecked() && cb6.isChecked())
                {
                    textView.setText("Cacing Lambung");
                    textView1.setText("Obat cacing dicampurkan air minum");
                }
                else if (cb4.isChecked())
                {
                    if(cb7.isChecked() && cb8.isChecked() && cb9.isChecked())
                    {
                        textView.setText("Tetelo");
                        textView1.setText("Vaksin Masa (Spray) \n Anti Biotik pada air minum");
                    }
                    else
                    {
                        textView.setText("Cacing Tenggorokan");
                        textView1.setText("Obat Suntik Cacing");
                    }
                }
                else if (cb7.isChecked())
                {
                    textView.setText("Berak Darah");
                    textView1.setText("Sulfanomida ditambah Aprolium pada air minum");
                }
                else
                {
                    textView.setText("Pilihan Salah");
                    textView1.setText("Om Telolet Om.....");
                }
            }
        });
    }
}
