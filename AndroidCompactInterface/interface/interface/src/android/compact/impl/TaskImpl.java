package android.compact.impl;

import android.content.Context;

import java.io.Serializable;

public interface TaskImpl extends Serializable {
    void run(Context context, TaskPayload payload, TaskCallback callback);
}
