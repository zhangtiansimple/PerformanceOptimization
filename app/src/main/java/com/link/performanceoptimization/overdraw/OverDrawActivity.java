package com.link.performanceoptimization.overdraw;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.link.performanceoptimization.R;

//https://developer.android.google.cn/topic/performance/rendering/inspect-gpu-rendering?hl=en
public class OverDrawActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overdue);
    }
}
