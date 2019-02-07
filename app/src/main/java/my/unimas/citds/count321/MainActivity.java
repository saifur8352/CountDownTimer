package my.unimas.citds.count321;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum = findViewById(R.id.txt_num);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                txtNum.setText(String.valueOf(l/1000));
            }

            @Override
            public void onFinish() {
                txtNum.setText("Finish");
            }
        }.start();
    }
}
