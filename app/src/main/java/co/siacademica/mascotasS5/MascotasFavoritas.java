package co.siacademica.mascotasS5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import co.siacademica.mascotasS5.R;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);

        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        ArrayList<Mascota> mascotaArrayList = new ArrayList<>();
        mascotaArrayList.add(new Mascota(R.drawable.luna,getResources().getString(R.string.nickname_pet1), 5));
        mascotaArrayList.add(new Mascota(R.drawable.eva,getResources().getString(R.string.nickname_pet6), 4));
        mascotaArrayList.add(new Mascota(R.drawable.firulay,getResources().getString(R.string.nickname_pet4), 2));
        mascotaArrayList.add(new Mascota(R.drawable.bambie,getResources().getString(R.string.nickname_pet5), 3));
        mascotaArrayList.add(new Mascota(R.drawable.manchas,getResources().getString(R.string.nickname_pet2), 4));

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotaArrayList, this);

        listaMascotas.setAdapter(adaptador);

    }
}
