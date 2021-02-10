package lt.markunaite;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;
    private Button buttonBlue;
    private Button buttonGreen;
    private Button buttonPink;
    private Button buttonLilac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout1 = findViewById(R.id.linearLayout1);
        linearLayout2 = findViewById(R.id.linearLayout2);
        linearLayout3 = findViewById(R.id.linearLayout3);
        linearLayout4 = findViewById(R.id.linearLayout4);
        buttonBlue = findViewById(R.id.buttonBlue);
        buttonGreen = findViewById(R.id.buttonGreen);
        buttonPink = findViewById(R.id.buttonPink);
        buttonLilac = findViewById(R.id.buttonLilac);

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setBackgroundColor(Color.parseColor("#98DFE8"));
                linearLayout2.setBackgroundColor(Color.parseColor("#E7EDEC"));
                linearLayout3.setBackgroundColor(Color.parseColor("#E7EDEC"));
                linearLayout4.setBackgroundColor(Color.parseColor("#E7EDEC"));
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout2.setBackgroundColor(Color.parseColor("#9BDDA1"));
                linearLayout1.setBackgroundColor(Color.parseColor("#E7EDEC"));
                linearLayout3.setBackgroundColor(Color.parseColor("#E7EDEC"));
                linearLayout4.setBackgroundColor(Color.parseColor("#E7EDEC"));
            }
        });

        buttonPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout3.setBackgroundColor(Color.parseColor("#F4D2DE"));
                linearLayout1.setBackgroundColor(Color.parseColor("#E7EDEC"));
                linearLayout2.setBackgroundColor(Color.parseColor("#E7EDEC"));
                linearLayout4.setBackgroundColor(Color.parseColor("#E7EDEC"));
            }

        });
        buttonLilac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout4.setBackgroundColor(Color.parseColor("#EACCF4"));
                linearLayout1.setBackgroundColor(Color.parseColor("#E7EDEC"));
                linearLayout2.setBackgroundColor(Color.parseColor("#E7EDEC"));
                linearLayout3.setBackgroundColor(Color.parseColor("#E7EDEC"));
            }
        });
    }
}