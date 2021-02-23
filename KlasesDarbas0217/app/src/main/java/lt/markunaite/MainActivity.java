package lt.markunaite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

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
                    BigInteger number = BigInteger.valueOf(Integer.parseInt(inputText.getText().toString()));
                    BigInteger fibonacciNumber = fibonacci(number);
                    outputText.setText("Fibonacci number of " + number + " is " + String.valueOf(fibonacciNumber));
                } catch (NumberFormatException ignored) {

                }

            }

            private BigInteger fibonacci(BigInteger number) {
                BigInteger zero = BigInteger.ZERO;
                BigInteger one = BigInteger.ONE;
                BigInteger c;

                if(number.equals(zero)) {
                } else if (number.equals(one)) {
                        return one;
                    }

                    for(int i = 2; i <=number.intValue(); i++) {
                        c = zero.add(one);
                        zero = one;
                        one = c;
                    }
                    return one;
            }
        });
    }
    }


