package com.github.doomsower;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;

@ReactModule(name = "RNZxcvbn")
public class RNZxcvbnModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNZxcvbn";
    private Zxcvbn zxcvbn;

    public RNZxcvbnModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void score(String password, Promise promise) {
        if (zxcvbn == null) {
            zxcvbn = new Zxcvbn();
        }
        Strength strength = zxcvbn.measure(password);
        promise.resolve(strength.getScore());
    }
}
