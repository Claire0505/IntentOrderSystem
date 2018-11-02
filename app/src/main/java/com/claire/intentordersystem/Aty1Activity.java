package com.claire.intentordersystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Aty1Activity extends AppCompatActivity {

    @BindView(R.id.tvDrink)
    TextView tvDrink;
    @BindView(R.id.tvIce)
    TextView tvIce;
    @BindView(R.id.tvSugar)
    TextView tvSugar;
    @BindView(R.id.btnChoose)
    Button btnChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aty1);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnChoose)
    public void setBtnChoose(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aty1Activity.this, Aty2Activity.class);
                startActivityForResult(intent, 0);

            }
        });
    }
}
