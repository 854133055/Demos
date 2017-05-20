package com.mcxtzhang.databindingdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mcxtzhang.databindingdemo.autobinding.AutoBindingActivity;
import com.mcxtzhang.databindingdemo.databinding.ActivityLauncherBinding;

public class LauncherActivity extends AppCompatActivity {
    ActivityLauncherBinding mBinding;

    public class Presenter {
        public void onMainClick(View view) {
            //startActivity(new Intent(LauncherActivity.this, MainActivity.class));
        }

        public void onRvClick(View view) {
            //startActivity(new Intent(LauncherActivity.this, RecyclerViewActivity.class));
        }

        public void onTwoWayClick(View view) {
            startActivity(new Intent(LauncherActivity.this, TwoWayActivity.class));
        }

        public void onLambdaClick(View view) {
            startActivity(new Intent(LauncherActivity.this, LambdaActivity.class));
        }

        public void onAnimAndCheckBoxClick(View view) {
            startActivity(new Intent(LauncherActivity.this, AnimAndCheckBoxActivity.class));
        }

        public void onAdapterClick(View v) {
            startActivity(new Intent(LauncherActivity.this, TestBindingAdapterActivity.class));
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_launcher, null, false);
        setContentView(mBinding.getRoot());

        mBinding.setP(new Presenter());

        mBinding.btnAutoBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauncherActivity.this, AutoBindingActivity.class));
            }
        });
    }
}
