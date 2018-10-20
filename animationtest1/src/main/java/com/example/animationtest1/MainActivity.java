package com.example.animationtest1;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.animationtest1.view.OnTouchView;

public class MainActivity extends Activity {
    private static final int MESSAGE_SCROLL_TO = 1;
    private static final int FRAME_COUNT = 30;
    private static final int DELAYED_TIME = 33;
    private int count = 1;
    private Button textButton;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MESSAGE_SCROLL_TO:
                    count++;
                    if (count <= FRAME_COUNT) {
                        float fraction = count / (float) FRAME_COUNT;
                        Log.d("panzqww","fraction = "+fraction);
                        int scrollX = (int) (fraction * 100);
                        textButton.scrollTo(scrollX, 0);
                        handler.sendEmptyMessageDelayed(MESSAGE_SCROLL_TO, DELAYED_TIME);
                    }
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textButton = findViewById(R.id.textButton);
        handler.sendEmptyMessageDelayed(MESSAGE_SCROLL_TO, DELAYED_TIME);
    }
}
