package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarEscala;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBarEscala = findViewById(R.id.seekBarEscala);
        textResultado = findViewById(R.id.textResultado);

        seekBarEscala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override // quando clica e arrasta
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textResultado.setText("Progresso" + progress + "/" + seekBar.getMax());
            }

            @Override // ao clicar em cima
            public void onStartTrackingTouch(SeekBar seekBar) {
                //textResultado.setText("onStart");
            }

            @Override // quando solta
            public void onStopTrackingTouch(SeekBar seekBar) {
                //textResultado.setText("onStop");
            }
        });
    }
    public void recuperarProgresso(View view){
        textResultado.setText("Escolhido: " + seekBarEscala.getProgress());
    }
}