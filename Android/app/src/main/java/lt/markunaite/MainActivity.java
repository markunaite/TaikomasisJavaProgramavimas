package lt.markunaite;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout1;
    private Button buttonRed;
    private Button buttonGreen;
    private Button buttonBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout1 = findViewById(R.id.linearLayout1);
        buttonRed = findViewById(R.id.buttonRed);
        buttonGreen = findViewById(R.id.buttonGreen);
        buttonBlue = findViewById(R.id.buttonBlue);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setBackgroundColor(Color.RED);
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setBackgroundColor(Color.GREEN);
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setBackgroundColor(Color.BLUE);
            }
        });
    }
}