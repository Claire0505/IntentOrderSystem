package com.claire.intentordersystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
        setBtnChoose();
    }

    @OnClick(R.id.btnChoose)
    public void setBtnChoose() {
        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Aty1Activity.this, Aty2Activity.class);
                startActivityForResult(intent, 0);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0){ //驗證發出對象
            if (resultCode == 101){ //確認Aty2Activity執行狀態
                Bundle bundle = data.getExtras();
                String str1 = bundle.getString("drink_level");
                String str2 = bundle.getString("sugar_level");
                CharSequence str3 = bundle.getString("ice_level");

                tvDrink.setText(str1);
                tvSugar.setText(str2);
                tvIce.setText(str3);
            }
        }
    }
}
