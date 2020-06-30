package co.siacademica.mascotasS5;
import android.content.ContentValues;
import android.content.Context;

import co.siacademica.mascotasS5.R;

import java.util.ArrayList;

public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;
    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos() {
        BaseDatos db = new BaseDatos(context);
        insertarTresMascotas(db);
        return  db.obtenerTodosLosMascotas();
    }



    public void insertarTresMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constantes.TABLE_MASCOTA_NOMBRE, "Luna");
        contentValues.put(Constantes.TABLE_MASCOTA_FOTO, R.drawable.bambie);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(Constantes.TABLE_MASCOTA_NOMBRE, "Bambie");
        contentValues.put(Constantes.TABLE_MASCOTA_FOTO, R.drawable.firulay);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(Constantes.TABLE_MASCOTA_NOMBRE, "Teo");
        contentValues.put(Constantes.TABLE_MASCOTA_FOTO, R.drawable.manchas);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(Constantes.TABLE_MASCOTA_NOMBRE, "Manchas");
        contentValues.put(Constantes.TABLE_MASCOTA_FOTO, R.drawable.eva);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(Constantes.TABLE_MASCOTA_NOMBRE, "Firulay");
        contentValues.put(Constantes.TABLE_MASCOTA_FOTO, R.drawable.luna);

        db.insertarMascota(contentValues);
    }

    public void darLikeMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constantes.TABLE_LIKES_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(Constantes.TABLE_LIKES_MASCOTA_NUMERO_LIKES, LIKE);
        db.insertarLikeMascota(contentValues);
    }

    public int obtenerLikesMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascota(mascota);
    }

}
