package com.example.hp.mathematics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class algebraActivity extends AppCompatActivity {

    ListView listViewalg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra);



        listViewalg = (ListView)findViewById(R.id.listViewalg);

        final String[] pcs = {  "সেট", "উৎপাদক","মান নির্ণয়", "সূচক", "লগারিদম", "সমাধান", "ধারা", "বাস্তব সংখ্যা", "জটিল সংখ্যা", "বহুপদী", "ফাংশন",
                "সমীকরণ", "দ্বিপদী বিস্তৃতি", "অসমতা", "e-বেস ফাংশন", "অনুপাত ও সমানুপাত"};

        ArrayAdapter adapteralg = new ArrayAdapter(this, R.layout.activity_algebra,R.id.list_itemalg,pcs);

        listViewalg.setAdapter(adapteralg);
        listViewalg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked on" + pcs[position], Toast.LENGTH_LONG).show();


                if (pcs[position] == "সেট") {
                    Intent i = new Intent(algebraActivity.this, setActivity.class);
                    startActivity(i);
                } else if (pcs[position] =="উৎপাদক" ) {
                    Intent i = new Intent(algebraActivity.this, UtpadokActivity.class);
                    startActivity(i);
                }else if (pcs[position] =="মান নির্ণয়" ) {
                    Intent i = new Intent(algebraActivity.this, MannirnoyActivity.class);
                    startActivity(i);
                }


                else if (pcs[position] =="সূচক" ) {
                    Intent i = new Intent(algebraActivity.this, SuchokActivity.class);
                    startActivity(i);
                } else if (pcs[position] == "লগারিদম") {
                    Intent i = new Intent(algebraActivity.this, LogarithmActivity.class);
                    startActivity(i);

                } else if (pcs[position] ==  "সমাধান") {
                    Intent i = new Intent(algebraActivity.this, SomadhanActivity.class);
                    startActivity(i);

                }
                else if (pcs[position] == "ধারা") {
                    Intent i = new Intent(algebraActivity.this, DharaActivity.class);
                    startActivity(i);

                }

                else if (pcs[position] ==  "বাস্তব সংখ্যা") {
                    Intent i = new Intent(algebraActivity.this, BastobsonkhaActivity.class);
                    startActivity(i);

                }
                else if (pcs[position] ==   "জটিল সংখ্যা") {
                    Intent i = new Intent(algebraActivity.this, JotilsongkhaActivity.class);
                    startActivity(i);

                }
                else if (pcs[position] ==   "বহুপদী") {
                    Intent i = new Intent(algebraActivity.this, BohupodiActivity.class);
                    startActivity(i);

                }
                else if (pcs[position] ==  "ফাংশন") {
                    Intent i = new Intent(algebraActivity.this, FunctionActivity.class);
                    startActivity(i);

                }
                else if (pcs[position] ==   "সমীকরণ") {
                    Intent i = new Intent(algebraActivity.this, SomikoronActivity.class);
                    startActivity(i);

                }
                else if (pcs[position] ==  "দ্বিপদী বিস্তৃতি") {
                    Intent i = new Intent(algebraActivity.this, DipodiActivity.class);
                    startActivity(i);

                }
                else if (pcs[position] ==  "অসমতা") {
                    Intent i = new Intent(algebraActivity.this, OsomotaActivity.class);
                    startActivity(i);

                }
                else if (pcs[position] == "e-বেস ফাংশন") {
                    Intent i = new Intent(algebraActivity.this, EbasefunctionActivity.class);
                    startActivity(i);

                }
                else if (pcs[position] ==    "অনুপাত ও সমানুপাত") {
                    Intent i = new Intent(algebraActivity.this, OnupatsomanupatActivity.class);
                    startActivity(i);

                }



            }


        });

    }
}
