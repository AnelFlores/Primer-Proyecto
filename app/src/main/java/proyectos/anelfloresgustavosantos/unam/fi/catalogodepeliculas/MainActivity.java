package proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas.adapters.Pelicula_adapter;
import proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas.model.Pelicula;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    //String peliculas[];
    List<Pelicula> data;
    Pelicula_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.list);
        list.setOnItemClickListener(this);
        //peliculas=getResources().getStringArray(R.array.Pelicula);

        data = new ArrayList < > {};
        adapter = new Pelicula_adapter(this,data);

        list.setAdapter(adapter);

        loadPeliculas();


    }
    public void  loadPeliculas(){
        Pelicula p1=new Pelicula();
        p1.setNombre("Deadpool");
        p1.setDuracion("140 minutos");
        p1.setFechaEstreno("20 Febrero");
        p1.setUrlimg();
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        //String p = peliculas[position];
        //Toast.makeText(this,"selecciono pelicula" +p,Toast.LENGTH_SHORT).show();
    }
}
