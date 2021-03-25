package com.lishuaihua.logger.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.lishuaihua.logger.JackLogger;
import com.lishuaihua.logger.demo.R;

public class MainActivity extends AppCompatActivity {
private static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logV(View view) {
        JackLogger.v(TAG,"Verbose");
    }

    public void logD(View view) {
        JackLogger.d(TAG,"Debug");
    }
    public void logI(View view) {
        JackLogger.i(TAG,"Info");
    }
    public void logE(View view) {
        JackLogger.e(TAG,"ERROR");
    }

    public void logW(View view) {
        JackLogger.w(TAG,"Warn");
    }

    public void logJson(View view) {
       String json="{\"tagValue\":\"满150-15；满300-40\",\"tagType\":2}";
        JackLogger.json(TAG,json);
    }

    public void logXml(View view) {
      String xml="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
              "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
              "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
              "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
              "    android:layout_width=\"match_parent\"\n" +
              "    android:layout_height=\"match_parent\"\n" +
              "    android:orientation=\"vertical\"\n" +
              "    tools:context=\".MainActivity\">\n" +
              "\n" +
              "    <Button\n" +
              "        android:layout_width=\"match_parent\"\n" +
              "        android:layout_height=\"50dp\"\n" +
              "        android:onClick=\"logV\"\n" +
              "        android:padding=\"10dp\"\n" +
              "        android:text=\"JackLogger.v\"\n" +
              "        android:textSize=\"14sp\"></Button>\n" +
              "\n" +
              "    <Button\n" +
              "        android:layout_width=\"match_parent\"\n" +
              "        android:layout_height=\"50dp\"\n" +
              "        android:onClick=\"logD\"\n" +
              "        android:padding=\"10dp\"\n" +
              "        android:text=\"JackLogger.d\"\n" +
              "        android:textSize=\"14sp\"></Button>\n" +
              "\n" +
              "    <Button\n" +
              "        android:layout_width=\"match_parent\"\n" +
              "        android:layout_height=\"50dp\"\n" +
              "        android:onClick=\"logI\"\n" +
              "        android:padding=\"10dp\"\n" +
              "        android:text=\"JackLogger.i\"\n" +
              "        android:textSize=\"14sp\"></Button>\n" +
              "\n" +
              "    <Button\n" +
              "        android:layout_width=\"match_parent\"\n" +
              "        android:layout_height=\"50dp\"\n" +
              "        android:onClick=\"logE\"\n" +
              "        android:padding=\"10dp\"\n" +
              "        android:text=\"JackLogger.e\"\n" +
              "        android:textSize=\"14sp\"></Button>\n" +
              "\n" +
              "    <Button\n" +
              "        android:layout_width=\"match_parent\"\n" +
              "        android:layout_height=\"50dp\"\n" +
              "        android:onClick=\"logW\"\n" +
              "        android:padding=\"10dp\"\n" +
              "        android:text=\"JackLogger.w\"\n" +
              "        android:textSize=\"14sp\"></Button>\n" +
              "\n" +
              "    <Button\n" +
              "        android:layout_width=\"match_parent\"\n" +
              "        android:layout_height=\"50dp\"\n" +
              "        android:onClick=\"logJson\"\n" +
              "        android:padding=\"10dp\"\n" +
              "        android:text=\"JackLogger.json\"\n" +
              "        android:textSize=\"14sp\"></Button>\n" +
              "\n" +
              "    <Button\n" +
              "        android:layout_width=\"match_parent\"\n" +
              "        android:layout_height=\"50dp\"\n" +
              "        android:onClick=\"logXml\"\n" +
              "        android:padding=\"10dp\"\n" +
              "        android:text=\"JackLogger.xml\"\n" +
              "        android:textSize=\"14sp\"></Button>\n" +
              "\n" +
              "</LinearLayout>";
        JackLogger.xml(TAG,xml);
    }
}