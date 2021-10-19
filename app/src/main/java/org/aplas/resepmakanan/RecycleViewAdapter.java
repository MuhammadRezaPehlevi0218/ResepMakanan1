package org.aplas.resepmakanan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();
    private ArrayList<String> bahan = new ArrayList<>();
    private ArrayList<String> caraMasak = new ArrayList<>();
    private Context context;

    public RecycleViewAdapter( ArrayList<String> foto, ArrayList<String> nama, ArrayList<String> info,ArrayList<String> bahan, ArrayList<String> caraMasak, Context context) {
        this.foto = foto;
        this.nama = nama;
        this.info = info;
        this.bahan= bahan;
        this.caraMasak= caraMasak;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(context).asBitmap().load(foto.get(position)).into(holder.imageView);
        holder.text1.setText(nama.get(position));
        holder.adapterConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context,nama.get(position),Toast.LENGTH_LONG).show();

                Intent intent=new Intent(context,DetailActivity.class);

                intent.putExtra("foto_makanan",foto.get(position));
                intent.putExtra("nama_makanan",nama.get(position));
                intent.putExtra("info_makanan",info.get(position));
                intent.putExtra("bahan_makanan",bahan.get(position));
                intent.putExtra("caraMasak_makanan",caraMasak.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nama.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView text1;
        ConstraintLayout adapterConstraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            text1 = itemView.findViewById(R.id.text1);
            adapterConstraintLayout = itemView.findViewById(R.id.adapterConstraintLayout);
        }
    }
}
