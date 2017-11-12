package com.gmail.coophub.feedback.canada.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class Messaging extends Service {
    public Messaging() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
