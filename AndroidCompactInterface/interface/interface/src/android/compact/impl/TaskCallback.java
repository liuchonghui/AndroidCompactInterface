package android.compact.impl;

import java.io.Serializable;

public interface TaskCallback extends Serializable {
    void onResult(TaskPayload payload);
}
