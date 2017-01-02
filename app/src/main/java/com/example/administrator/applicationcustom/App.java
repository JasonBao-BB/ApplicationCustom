package com.example.administrator.applicationcustom;

import android.app.Application;

/**
 * Created by Administrator on 2017/1/1 0001.
 */

public class App extends Application {
    private String textData = "Default";

    public void setTextData(String textData) {
        this.textData = textData;
    }

    public String getTextData() {
        return textData;
    }
}
