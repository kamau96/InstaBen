
package com.example.instaben;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created


    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mw8mTLe5Rm4p5qLdXD82q3i7Tw31Ju6n1RULkI3a")
                .clientKey("1PBsuRCyNDxGkRFamyHG1Lt4MoBy0SKJsUotvTpr")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}