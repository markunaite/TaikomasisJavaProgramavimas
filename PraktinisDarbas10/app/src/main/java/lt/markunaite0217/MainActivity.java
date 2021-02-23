package lt.markunaite0217;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private Button inputButton;
    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        inputButton = findViewById(R.id.inputButton);
        outputText = findViewById(R.id.outputText);

        inputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int number = Integer.parseInt(inputText.getText().toString());

                    int[] randomNumbers = new int[number];
                    for (int i = 0; i < randomNumbers.length; i++) {
                        randomNumbers[i] = randomNumber(0, 100);
                    }

                    outputText.setText("Random numbers of " + number + " are " + Arrays.toString(randomNumbers));
                } catch (NumberFormatException ignored) {

                }
            }

            private int randomNumber(int pradzia, int pabaiga) {  //sugeneruoja random skaiciu
                return new Random().nextInt(pabaiga - pradzia) + pradzia;
            }

        });
    }
}