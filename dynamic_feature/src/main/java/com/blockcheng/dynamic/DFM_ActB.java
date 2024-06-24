package com.blockcheng.dynamic;

import android.app.Activity;
import android.os.Bundle;

import com.blockcheng.dynamic_feature.R;

public class DFM_ActB extends Activity {

    DFMObject object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dfm_actb);
        object = new DFMObject();
        System.out.println(object.name);
    }
}
