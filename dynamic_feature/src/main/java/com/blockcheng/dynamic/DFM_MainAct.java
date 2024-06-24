package com.blockcheng.dynamic;

import android.app.Activity;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.blockcheng.dynamic_feature.R;

public class DFM_MainAct extends Activity implements View.OnClickListener {

    private static final String TAG = "dynamic_main1";

    DFMObject object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dfm_main);

        findViewById(R.id.button_dfm_main_center).setOnClickListener(this);
        object = new DFMObject();
    }

    @Override
    public void onClick(View v) {
//        Intent intent = new Intent(this,DFM_ActB.class);
//        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"动态模块处于运行期"+object.name);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"动态模块处于暂停期");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"动态模块处于销毁期");
    }
}
