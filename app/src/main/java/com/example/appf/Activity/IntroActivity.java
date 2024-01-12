package com.example.appf.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.appf.R;
import com.example.appf.databinding.ActivityIntroBinding;

public class IntroActivity extends BaseActivity {
    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setVariable();
        getWindow().setStatusBarColor(Color.parseColor("#FFF485"));
    }

    private void setVariable() {
        binding.loginbtn.setOnClickListener(v -> {
            if(mAuth.getCurrentUser()!=null){
                startActivity(new Intent(IntroActivity.this,MainActivity.class));
            }else{
                startActivity(new Intent(IntroActivity.this,LoginActivity.class));

            }
        });
        binding.signinbtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this,SignupActivity.class)));
    }
}