package org.aplas.resepmakanan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private Context context;

    private static final String DATABASE_NAME="Resep.db";
    private static final int DATABASE_VERSION=1;

    private static final String NAMA_TABEL="data_resep";
    private static final String KOLOM_ID="_id";
    private static final String KOLOM_NAMAMASAKAN="nama_masakan";
    private static final String KOLOM_BAHAN="bahan_masakan";
    private static final String KOLOM_CARAMASAK="cara_masak";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context=context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="CREATE TABLE "+NAMA_TABEL+
                " ("+KOLOM_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                KOLOM_NAMAMASAKAN +" TEXT, "+
                KOLOM_BAHAN +" TEXT, "+
                KOLOM_CARAMASAK +" TEXT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+NAMA_TABEL);
        onCreate(db);
    }

    void addRecipe(String title, String ingridients, String tutorial){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(KOLOM_NAMAMASAKAN, title);
        cv.put(KOLOM_BAHAN, ingridients);
        cv.put(KOLOM_CARAMASAK, tutorial);
        long result = db.insert(NAMA_TABEL,null, cv);
        if(result == -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Added Successfully!", Toast.LENGTH_SHORT).show();
        }
    }
    Cursor readAllData(){
        String query = "SELECT * FROM " + NAMA_TABEL;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if(db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }
    void updateData(String row_id, String title, String ingridients, String tutorial){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(KOLOM_NAMAMASAKAN, title);
        cv.put(KOLOM_BAHAN, ingridients);
        cv.put(KOLOM_CARAMASAK, tutorial);

        long result = db.update(NAMA_TABEL, cv, "_id=?", new String[]{row_id});
        if(result == -1){
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Updated Successfully!", Toast.LENGTH_SHORT).show();
        }

    }
    void deleteOneRow(String row_id){
        SQLiteDatabase db = this.getWritableDatabase();
        long result = db.delete(NAMA_TABEL, "_id=?", new String[]{row_id});
        if(result == -1){
            Toast.makeText(context, "Failed to Delete.", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "Successfully Deleted.", Toast.LENGTH_SHORT).show();
        }
    }
    void deleteAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + NAMA_TABEL);
    }
}
