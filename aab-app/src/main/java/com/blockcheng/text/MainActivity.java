package com.blockcheng.text;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Keep;


public class MainActivity extends Activity {
  private TextView hotfixView;
  private Button centerButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    hotfixView = findViewById(R.id.tv_main_top);
    centerButton = findViewById(R.id.button_main_center);
    hotfixView.setText("Hi, LuaReinforce.");
    centerButton.setOnClickListener(v -> {
      // Toast.makeText(MainActivity.this,hotfixView.getText() ,Toast.LENGTH_LONG).show();
    });
  }
}
