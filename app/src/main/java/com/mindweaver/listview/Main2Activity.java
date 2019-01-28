package com.mindweaver.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SeekBar;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SeekBar seekBar=(SeekBar)findViewById(R.id.seekBar);
        ListView listView=(ListView)findViewById(R.id.timelistview);

        seekBar.setMax(20);
        seekBar.setProgress(10);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                                               @Override
                                               public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                                                   int min=1;
                                                   int TimesTable;


                                                   if(progress<min){
                                                       TimesTable=min;
                                                       seekBar.setProgress(min);
                                                   }
                                                   else {
                                                       TimesTable=progress;
                                                   }

                                                   Log.i("TimesTablleVaue",Integer.toString(TimesTable));
                                               }

                                               @Override
                                               public void onStartTrackingTouch(SeekBar seekBar) {

                                               }

                                               @Override
                                               public void onStopTrackingTouch(SeekBar seekBar) {

                                               }
                                           }
        );
    }
}
