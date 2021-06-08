package com.lishuaihua.logger.demo;

import android.app.Application;

import com.lishuaihua.logger.AndroidLogAdapter;
import com.lishuaihua.logger.JackLogger;

public class LoggerApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JackLogger.addLogAdapter(new AndroidLogAdapter());
    }
}
