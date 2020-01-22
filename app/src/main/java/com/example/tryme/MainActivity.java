package com.example.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View windowView;
    private Button tryMeBtn;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.BLACK,Color.BLUE, Color.CYAN, Color.DKGRAY, Color.GRAY, Color.GREEN, Color.LTGRAY, Color.MAGENTA, Color.RED, Color.WHITE, Color.YELLOW};

        windowView = findViewById(R.id.windowView);
        tryMeBtn = findViewById(R.id.try_me);
        tryMeBtn.setOnClickListener((View view) -> {
            int colorArrayLength = colors.length;
            Random random = new Random();
            int rand = random.nextInt(colorArrayLength);
            windowView.setBackgroundColor(colors[rand]);
        });
    }
}
