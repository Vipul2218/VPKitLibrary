package com.naypra.vpkitlibrary;

import android.Manifest;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.naypra.vpkit.common.VPKitDialog;
import com.naypra.vpkit.common.VPKitProgressDialog;
import com.naypra.vpkit.permission.VPKitPermissionsActivity;
import com.naypra.vpkit.permission.VPKitPermissionsChecker;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
