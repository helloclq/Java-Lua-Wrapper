package com.blockcheng.text;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import org.json.JSONObject;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class MyApplication extends Application {

  private static final String TAG = "MyApplication";

  protected void attachBaseContext(Context base) {
    super.attachBaseContext(base);
  }

  @Override
  public void onCreate() {
    super.onCreate();

  }
}
