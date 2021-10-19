package org.aplas.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotomakanan;
    TextView textViewNamaMakanan,textViewdetailMakanan, textViewBahanMakanan, textViewCaraMasak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotomakanan=findViewById(R.id.imageViewDetail);
        textViewNamaMakanan=findViewById(R.id.textViewNamaMakanan);
        textViewdetailMakanan=findViewById(R.id.textViewdetailMakanan);
        textViewBahanMakanan=findViewById(R.id.textViewBahanMakanan);
        textViewCaraMasak=findViewById(R.id.textViewCaraMasakMakanan);

        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if (getIntent().hasExtra("foto_makanan")&&getIntent().hasExtra("info_makanan")){
            String fotoMakanan=getIntent().getStringExtra("foto_makanan");
            String namaMakanan=getIntent().getStringExtra("nama_makanan");
            String infoMakanan=getIntent().getStringExtra("info_makanan");
            String bahanMakanan=getIntent().getStringExtra("bahan_makanan");
            String caraMasak=getIntent().getStringExtra("caraMasak_makanan");

            setDataActivity(fotoMakanan,namaMakanan,infoMakanan,bahanMakanan,caraMasak);
        }
    }
    private void setDataActivity(String fotoMakanan,String namaMakanan, String infoMakanan, String bahanMakanan, String caraMasak){
        Glide.with(this).asBitmap().load(fotoMakanan).into(imageViewFotomakanan);
        textViewNamaMakanan.setText(namaMakanan);
        textViewdetailMakanan.setText(infoMakanan);
        textViewBahanMakanan.setText(bahanMakanan);
        textViewCaraMasak.setText(caraMasak);
    }
}