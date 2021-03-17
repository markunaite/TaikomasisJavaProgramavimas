package lt.markunaite0309;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private TextView timerView;
    private Button start;
    private Button pause;
    private Button reset;

    private long totalTime = 0;
    private boolean isRunning = false;
    private Timer timer;
    private TimerTask timerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerView = findViewById(R.id.timer);
        start = findViewById(R.id.start);
        pause = findViewById(R.id.pause);
        reset = findViewById(R.id.reset);

        start.setOnClickListener(v -> {
            if (!isRunning) {
                startTimer();
                isRunning = true;
            }
        });

        pause.setOnClickListener(v -> {
            if (isRunning) {
                timer.cancel();
                isRunning = false;
            }
        });

        reset.setOnClickListener(v -> {
            timer.cancel();
            isRunning = false;
            totalTime = 0;
            updateLabel.sendEmptyMessage(0);
        });
    }

    public void startTimer() {
        timer = new Timer();
        timerTask = new AppTimerTask();
        timer.schedule(timerTask, 0, 1000);
    }

    private class AppTimerTask extends TimerTask {
        @Override
        public void run() {
            totalTime++;
            updateLabel.sendEmptyMessage(0);
        }
    }

    private Handler updateLabel = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            long seconds = totalTime % 60;
            long minutes = (totalTime / 60) % 60;
            long hours = (totalTime / 3600);
            timerView.setText(String.format("%02d : %02d : %02d", hours, minutes, seconds));
        }
    };
}