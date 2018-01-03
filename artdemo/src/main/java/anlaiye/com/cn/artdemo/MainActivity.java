package anlaiye.com.cn.artdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import anlaiye.com.cn.artdemo.c1.LifeCycleTestActivity;
import anlaiye.com.cn.artdemo.forresult.ForResultActivity1;
import anlaiye.com.cn.artdemo.lifecycle.AActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnLifeCycle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LifeCycleTestActivity.class));
            }
        });

        findViewById(R.id.btnLifeCycle2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AActivity.class));
            }
        });
        findViewById(R.id.btnStartFinsih).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ForResultActivity1.class));
            }
        });
    }
}
