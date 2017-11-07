package com.example.hp.mathematics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class generalActivity extends AppCompatActivity {
    ListView listViewgen;
    ArrayAdapter<String> adaptergen;

    String[] android_versions1 ={
            "Cupcake",
            "Donut",
            "Ecliar",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "jelly Bean",
            "Kitkat",
            "Lollipop"

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        listViewgen =(ListView) findViewById(R.id.list_viewgen);
        adaptergen = new ArrayAdapter<String>(this,R.layout.list_view_custom_layoutgen,R.id.list_itemgen,android_versions1);
        listViewgen.setAdapter(adaptergen);
        listViewgen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" is selected ",Toast.LENGTH_LONG).show();
            }
        });


    }
}
