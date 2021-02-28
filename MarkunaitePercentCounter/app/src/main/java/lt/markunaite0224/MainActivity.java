package lt.markunaite0224;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    private final String NUMBER_TEMPLATE = "%1$,.2f";
    private final String RESULT_TEMPLATE = "Entered amount = %1$,.2f \n Discount = %2$,.2f \n Sum with discount = %3$,.2f";
    private EditText amount;
    private SeekBar slide;
    private TextView tip;
    private TextView total;
    private TextView result;
    private TextView percent;
    private double nuolaida;
    private double rezultatas;
    private double pritaikytaNuolaida;

    public void updateSliderValue(SeekBar seekBar) {
        percent.setText(nuolaida + "%/" + seekBar.getMax() +"%");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = findViewById(R.id.amount);
        slide = findViewById(R.id.slide);
        tip = findViewById(R.id.tip);
        total = findViewById(R.id.total);
        result = findViewById(R.id.result);
        percent = findViewById(R.id.percent);

        percent.setText(slide.getProgress() + "%/" + slide.getMax() + "%");
        slide.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                double amountValue = Double.valueOf(amount.getText().toString());
                nuolaida = Double.valueOf(progress);
                pritaikytaNuolaida = amountValue * (nuolaida / 100);
                tip.setText(String.format(NUMBER_TEMPLATE, pritaikytaNuolaida));
                rezultatas = amountValue - pritaikytaNuolaida;
                total.setText(String.format(NUMBER_TEMPLATE, rezultatas));
                String resultText = String.format(RESULT_TEMPLATE, amountValue, pritaikytaNuolaida, rezultatas);
                result.setText(resultText);

                updateSliderValue(seekBar);

            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}