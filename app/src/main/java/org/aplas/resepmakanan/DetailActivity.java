package org.aplas.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewDetail;
    TextView textViewNamaMakanan,textViewdetailMakanan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewDetail = findViewById(R.id.imageViewDetail);
        textViewNamaMakanan = findViewById(R.id.textViewNamaMakanan);
        textViewdetailMakanan = findViewById(R.id.textViewdetailMakanan);

        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if (getIntent().hasExtra("foto_makanan") && getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("info_makanan")){
            String foto=getIntent().getStringExtra("foto_makanan");
            String nama=getIntent().getStringExtra("nama_makanan");
            String info=getIntent().getStringExtra("info_makanan");

            setDataActivity(foto,nama,info);
        }
    }
    private void setDataActivity(String foto,String nama, String info){
        Glide.with(this).asBitmap().load(foto).into(imageViewDetail);
        textViewNamaMakanan.setText(nama);
        textViewdetailMakanan.setText(info);
    }
}