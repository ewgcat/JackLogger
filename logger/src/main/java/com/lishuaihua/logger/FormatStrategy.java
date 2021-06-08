package com.lishuaihua.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public interface FormatStrategy {

  void log(int priority, @Nullable String tag, @NonNull String message);
}
