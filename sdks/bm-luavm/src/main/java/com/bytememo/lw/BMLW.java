package com.bytememo.lw;

import androidx.annotation.Keep;

@Keep
public class BMLW {
    @Keep
    public static void load() {
        System.loadLibrary("bm_lw");
    }

    @Keep
    public static String libraryName() {
        return "bm_lw";
    }
}
