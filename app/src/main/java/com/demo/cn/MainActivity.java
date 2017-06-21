package com.demo.cn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        //设置带图片的文本 居中方式
        SpannableString spannableString = new SpannableString("aa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        MyImageSpan1 imageSpan = new MyImageSpan1(this,R.mipmap.ic_launcher);
        spannableString.setSpan(imageSpan,2,3, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv1.setText(spannableString);
    }
}
