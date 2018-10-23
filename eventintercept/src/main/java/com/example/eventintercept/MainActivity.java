package com.example.eventintercept;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.eventintercept.activities.FirstActivity;
import com.example.eventintercept.activities.FourActivity;
import com.example.eventintercept.activities.SecondActivity;
import com.example.eventintercept.activities.SixActivity;
import com.example.eventintercept.activities.ViewPagerActivity;
import com.example.eventintercept.activities.ViewPagerInScrlloer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        switch (v.getId()) {
            case R.id.btn_first:
                jump(FirstActivity.class);
                break;
            case R.id.btn_second:
                jump(SecondActivity.class);
                break;

            case R.id.btn_third:
                jump(ViewPagerInScrlloer.class);
                break;

            case R.id.btn_four:
                jump(FourActivity.class);
                break;

            case R.id.btn_five:
                jump(ViewPagerActivity.class);
                break;

            case R.id.btn_six:
                jump(SixActivity.class);
                break;
            default:
                break;

        }

    }

    public void jump(Class<? extends Activity> clz) {
        Intent intent = new Intent(this, clz);
        startActivity(intent);
    }
}
