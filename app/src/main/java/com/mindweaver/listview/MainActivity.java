package com.mindweaver.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,Main2Activity.class);
               startActivity(intent);

            }
        });

        final ListView listView=(ListView)findViewById(R.id.mylistview);

        final ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Anwesh");
        arrayList.add("Nivetha");
        arrayList.add("Chaithali");
        arrayList.add("Prachi");
        arrayList.add("Ram");
        arrayList.add("Radha");
        arrayList.add("Sashi");
        arrayList.add("Raghav");
        arrayList.add("Hari");
        arrayList.add("Rahul");
        arrayList.add("Sham");
        arrayList.add("Rahim");
        arrayList.add("Ram");
        arrayList.add("Radha");
        arrayList.add("Sashi");
        arrayList.add("Raghav");
        arrayList.add("Hari");
        arrayList.add("Rahul");
        arrayList.add("Sham");
        arrayList.add("Rahim");
        arrayList.add("Ram");
        arrayList.add("Radha");
        arrayList.add("Sashi");
        arrayList.add("Raghav");
        arrayList.add("Hari");
        arrayList.add("Rahul");
        arrayList.add("Sham");
        arrayList.add("Rahim");
        arrayList.add("Anwesh");
        arrayList.add("Nivetha");
        arrayList.add("Chaithali");
        arrayList.add("Prachi");
        arrayList.add("Ram");
        arrayList.add("Radha");
        arrayList.add("Sashi");
        arrayList.add("Raghav");
        arrayList.add("Hari");
        arrayList.add("Rahul");
        arrayList.add("Sham");
        arrayList.add("Rahim");
        arrayList.add("Ram");
        arrayList.add("Radha");
        arrayList.add("Sashi");
        arrayList.add("Raghav");
        arrayList.add("Hari");
        arrayList.add("Rahul");
        arrayList.add("Sham");
        arrayList.add("Rahim");
        arrayList.add("Ram");
        arrayList.add("Radha");
        arrayList.add("Sashi");
        arrayList.add("Raghav");
        arrayList.add("Hari");
        arrayList.add("Rahul");
        arrayList.add("Sham");
        arrayList.add("Rahim");

        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
              listView.setAdapter(arrayAdapter);

             listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                 @Override
                                                 public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                      Log.i("Tapped name",arrayList.get(position));
                                                     Toast.makeText(getApplicationContext(),"I am "+arrayList.get(position),Toast.LENGTH_LONG).show();
                                                 }
                                             }


             );



    }
}
