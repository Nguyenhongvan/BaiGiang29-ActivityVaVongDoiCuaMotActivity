package com.vansuzy.baigiang29_activityvavongdoicuamotactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManHinh2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);
    }

    public void quayVeManHinhMain(View view) {
        Intent intent = new Intent(ManHinh2Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
