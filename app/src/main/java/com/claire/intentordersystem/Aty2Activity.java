package com.claire.intentordersystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aty2);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSent)
    public void onViewClicked() {
    }
}
