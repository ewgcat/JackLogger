# JackLogger
## 一个打印日志的完美工具JackLogger


### Step 1. Add the JitPack repository to your build file

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
### Step 2. Add the dependency
```
dependencies {
	        implementation 'com.github.ewgcat:JackLogger:1.0.0'
}
```
### Step 3. init in Application
```
   JackLogger.init(BuildConfig.DEBUG);
```
### Step4 use.
```
public class MainActivity extends AppCompatActivity {
   
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logV(View view) {
        JackLogger.v(TAG, "Verbose");
    }

    public void logD(View view) {
        JackLogger.d(TAG, "Debug");
    }

    public void logI(View view) {
        JackLogger.i(TAG, "Info");
    }

    public void logE(View view) {
        JackLogger.e(TAG, "ERROR");
    }

    public void logW(View view) {
        JackLogger.w(TAG, "Warn");
    }

    public void logJson(View view) {
        String json = "{\"tagValue\":\"满150-15；满300-40\",\"tagType\":2}";
        JackLogger.json(TAG, json);
    }

    public void logXml(View view) {
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "android:layout_width=\"match_parent\"\n" +
                "android:layout_height=\"match_parent\"\n" +
                "android:orientation=\"vertical\"\n" +
                ">\n" +
                "</LinearLayout>";
        JackLogger.xml(TAG, xml);
    }
}
```
效果图：https://juejin.cn/post/6943620323287760932/
