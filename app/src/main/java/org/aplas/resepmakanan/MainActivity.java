package org.aplas.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
    }
    private void proses(){
        RecyclerView recyclerView = findViewById(R.id.recyleview);
        RecycleViewAdapter adapter = new RecycleViewAdapter(foto, nama, info, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void getData(){
        nama.add("Soto");
        foto.add("https://cdns.klimg.com/merdeka.com/i/w/news/2017/11/06/906065/670x335/4-resep-dan-cara-membuat-soto-ayam-bening-enak-dan-sederhana-kln.jpg");
        info.add("aswadsawdsawdasdwasdawdssawsdawdsawdsawdsawdsawdsa");

        nama.add("Pecel");
        foto.add("https://th.bing.com/th/id/OIP.4YbvSMtH4L63HZGxOVQIYgHaEK?w=263&h=180&c=7&r=0&o=5&pid=1.7");
        info.add("aswadsawdsawdasdwasdawdssawsdawdsawdsawdsawdsawdsa");

        proses();
    }
}