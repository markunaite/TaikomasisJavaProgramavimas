package lt.markunaite0317;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private MediaPlayer audioPlayer;
    private int pausePosition;
    private ImageView play, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_values, R.layout.spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_dropwdown_item);
        spinner.setAdapter(adapter);

        play = findViewById(R.id.play);
        stop = findViewById(R.id.stop);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClickButton(View view) {
        int position = spinner.getSelectedItemPosition();
        int melody = getMelodyByPosition(position);
        switch (view.getId()) {
            case R.id.play:
                if (audioPlayer == null) {
                    audioPlayer = MediaPlayer.create(getApplicationContext(), melody);
                    audioPlayer.start();
                    play.setImageResource(R.drawable.pause);
                } else if (audioPlayer.isPlaying()) {
                    audioPlayer.pause();
                    pausePosition = audioPlayer.getCurrentPosition();
                    play.setImageResource(R.drawable.play);
                } else if (!audioPlayer.isPlaying()) {
                    audioPlayer.seekTo(pausePosition);
                    audioPlayer.start();
                    pausePosition = audioPlayer.getCurrentPosition();
                    play.setImageResource(R.drawable.pause);
                }

                break;
            case R.id.stop:
                if (audioPlayer != null) {
                    audioPlayer.stop();
                    audioPlayer = null;
                    play.setImageResource(R.drawable.play);
                }
                break;
        }
    }

    private int getMelodyByPosition(int position) {
        int[] melodies = new int[]{R.raw.song01, R.raw.song02, R.raw.song03};
        return melodies[position];
    }
}