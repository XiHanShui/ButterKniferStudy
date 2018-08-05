package com.learn.butterkniferstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.learn.butterknife.ButterKnife;
import com.learn.butterknife.Unbinder;
import com.learn.butterknife_annotations.BindView;

public class Main2Activity extends AppCompatActivity {

    private Unbinder mBind;

    @BindView(R.id.tv)
    TextView mTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mBind = ButterKnife.bind(this);

        mTv.setText("测试");

        Toast.makeText(this, mTv.getText().toString().trim(), Toast.LENGTH_SHORT).show();


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBind.unbind();
    }
}
