package com.templatemela.camscanner;

import android.content.Context;
import android.content.SharedPreferences;

public class Savepref {

    public final static String PREFS_NAME = "PSDreamsPrefs";
    private static Context context;
    public final String FAVORITES1 = "Notification1";

    public Savepref(Context context) {
        this.context = context;
    }



    public static int getsubid() {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, 0);
        return prefs.getInt("subid", 0);
    }

    public static void setsubid(int value) {
        SharedPreferences sharedPref = context.getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("subid", value);
        editor.apply();
    }



}
