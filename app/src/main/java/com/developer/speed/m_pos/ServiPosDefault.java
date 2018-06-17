package com.developer.speed.m_pos;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmConfiguration.Builder;

public class ServiPosDefault extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration serviPosConfig = new Builder().name("servipos.realm").build();
        Realm.setDefaultConfiguration(serviPosConfig);
    }

    public class ServiActivity extends AppCompatActivity {
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Realm serviRealm = Realm.getDefaultInstance();
            try {

            } finally {
                serviRealm.close();
            }
        }
    }
}
