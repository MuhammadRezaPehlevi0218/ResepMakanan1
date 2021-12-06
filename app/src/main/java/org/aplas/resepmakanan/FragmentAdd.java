package org.aplas.resepmakanan;

import android.os.Bundle;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentAdd extends Fragment {

    EditText inputNamaMakanan,inputBahanMakanan,inputCaraMemasak;
    Button addButton;
    private AppCompatDelegate mDelegate;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false);
        inputNamaMakanan = root.findViewById(R.id.inputNamaMakanan);
        inputBahanMakanan = findViewById(R.id.inputBahanMakanan);
        inputCaraMemasak = findViewById(R.id.inputCaraMemasak);
        addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHelper myDB = new DatabaseHelper(FragmentAdd.this);
                myDB.addRecipe(inputNamaMakanan.getText().toString().trim(),
                        inputBahanMakanan.getText().toString().trim(),
                        inputCaraMemasak.getText().toString().trim());
            }
        });
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getActivity().setTitle("Add");
    }

    public <T extends View> T findViewById(@IdRes int id) {
        return getDelegate().findViewById(id);
    }
    public AppCompatDelegate getDelegate() {
        if (mDelegate == null) {
            mDelegate = AppCompatDelegate.create(this, this);
        }
        return mDelegate;
    }

}