package com.lishuaihua.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.util.Log;

import static com.lishuaihua.logger.Utils.checkNotNull;


public class LogcatLogStrategy implements LogStrategy {

  static final String DEFAULT_TAG = "NO_TAG";

  @Override public void log(int priority, @Nullable String tag, @NonNull String message) {
    checkNotNull(message);

    if (tag == null) {
      tag = DEFAULT_TAG;
    }

    Log.println(priority, tag, message);
  }
}
