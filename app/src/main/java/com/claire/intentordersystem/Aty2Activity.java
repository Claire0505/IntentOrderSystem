package com.claire.intentordersystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Aty2Activity extends AppCompatActivity {

    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.radioNoSugar)
    RadioButton radioNoSugar;
    @BindView(R.id.radioLessSugar)
    RadioButton radioLessSugar;
    @BindView(R.id.radioHalfSugar)
    RadioButton radioHalfSugar;
    @BindView(R.id.radioRegularSugar)
    RadioButton radioRegularSugar;
    @BindView(R.id.radioGroup1)
    RadioGroup radioGroup1;
    @BindView(R.id.radioNoIce)
    RadioButton radioNoIce;
    @BindView(R.id.radioLightIce)
    RadioButton radioLightIce;
    @BindView(R.id.radioLessIce)
    RadioButton radioLessIce;
    @BindView(R.id.radioRegularIce)
    RadioButton radioRegularIce;
    @BindView(R.id.radioGroup2)
    RadioGroup radioGroup2;
    @BindView(R.id.btnSent)
    Button btnSent;

    String sugar = "無糖";
    String ice = "微冰";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aty2);
        ButterKnife.bind(this);
        setBtnSent();
        setRadioGroup1();
        setRadioGroup2();
    }

    @OnClick(R.id.btnSent)
    public void setBtnSent() {
        btnSent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = editText.getText().toString();
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("drink_level", temp);
                bundle.putString("sugar_level",sugar);
                bundle.putString("ice_level", ice);
                intent.putExtras(bundle);
                setResult(101, intent);
                finish();
            }
        });
    }


    @OnClick(R.id.radioGroup1)
    public void setRadioGroup1() {
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case R.id.radioNoSugar:
                        //sugar = "無糖"; //按下記錄字串
                        sugar = radioNoSugar.getText().toString();
                        break;
                    case R.id.radioLessSugar:
                        //sugar = "少糖";
                        sugar = radioLessSugar.getText().toString();
                        break;
                    case R.id.radioHalfSugar:
                        sugar = "半糖";
                        break;
                    case R.id.radioRegularSugar:
                        sugar = "正常糖";
                        break;
                }

            }
        });
    }

    @OnClick(R.id.radioGroup2)
    public void setRadioGroup2() {
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId){
                    case R.id.radioNoIce:
                        ice = "去冰";
                        break;
                    case R.id.radioLightIce:
                        ice = "微冰";
                        break;
                    case R.id.radioLessIce:
                        ice = "少冰";
                        break;
                    case R.id.radioRegularIce:
                        ice = "正常冰";
                        break;
                }
            }
        });
    }
}
