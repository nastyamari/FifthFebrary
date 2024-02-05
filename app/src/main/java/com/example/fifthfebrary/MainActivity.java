package com.example.fifthfebrary;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bgButton;
    public ConstraintLayout relativeLayout;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgButton = findViewById(R.id.button_fon);
        relativeLayout = findViewById(R.id.ConstraintLayout);
        context = MainActivity.this;
        bgButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);

        final CharSequence[] items = {getText(R.string.red),  getText(R.string.green), getText(R.string.yellow)
        };
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    if (which == 0) {
                        relativeLayout.setBackgroundResource(R.color.redColor);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                    }
                    if (which == 1) {
                        relativeLayout.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                    }
                    if (which == 2) {
                        relativeLayout.setBackgroundResource(R.color.yellowColor);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                    }
                }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
