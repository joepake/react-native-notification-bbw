package com.reactnativenotification;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

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
    public void show(ReadableMap args, final Callback callback) {
        DropDownAlert downAlertNoImage = new DropDownAlert(getCurrentActivity(), getCurrentActivity(), false);
        downAlertNoImage.setTitle("Warning!");
        downAlertNoImage.setContent("Do NOT click");
        downAlertNoImage.show();

        // callback.invoke(null, metaDataFromFile(new File(files[0])));
    }

}
