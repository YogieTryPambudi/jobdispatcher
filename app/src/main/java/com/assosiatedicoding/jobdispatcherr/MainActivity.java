package com.assosiatedicoding.jobdispatcherr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSetScheduler, btnCancelScheduler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCancelScheduler = (Button)findViewById(R.id.btn_cancel_scheduler);
        btnSetScheduler = (Button)findViewById(R.id.btn_set_scheduler);

        btnSetScheduler.setOnClickListener(this);
        btnCancelScheduler.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_set_scheduler){
            Toast.makeText(this, "Dispatcher Created", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.btn_cancel_scheduler){
            Toast.makeText(this, "Dispatcher Cancelled", Toast.LENGTH_SHORT).show();
        }


    }
}
