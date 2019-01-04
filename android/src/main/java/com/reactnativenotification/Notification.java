package com.reactnativenotification;

import android.view.View;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

public class Notification extends ReactContextBaseJavaModule {
    private static final String NAME = "RNNotification";

    public Notification(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void show(final ReadableMap args, final Callback callback) {
        DropDownAlert downAlertNoImage = new DropDownAlert(getCurrentActivity(), getReactApplicationContext(), false);
        downAlertNoImage.setTitle(args.getString("title"));
        downAlertNoImage.setContent(args.getString("body"));
        downAlertNoImage.setDropDownAlertListener(new DropDownAlert.DropDownAlertListener() {
            @Override
            public void onClick(View v) {
                callback.invoke(true, args.getString("payload"));
            }
        });
        downAlertNoImage.show();
    }

}
