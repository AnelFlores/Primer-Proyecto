package proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas.adapters;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

import proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas.R;
import proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas.model.Pelicula;

import static proyectos.anelfloresgustavosantos.unam.fi.catalogodepeliculas.R.id.img;

public class Pelicula_adapter extends BaseAdapter {
    Activity activity;
    List<Pelicula> data;

    public Pelicula_adapter(Activity activity, List<Pelicula> data) {0
        this.activity = activity;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();

    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if(v==null) {
            v = View.inflate(activity, R.layout.template_pelicula, null);
        }
        Pelicula p = data.get(i);

        TextView titulo = v.findViewById(R.id.titulo);
        TextView duracion =v.findViewById(R.id.txt_duracion);
        TextView fecha =v.findViewById(R.id.txt_fecha);
        TextView img =v.findViewById(R.id.img);

        titulo.setText(p.getNombre());
        duracion.setText(p.getDuracion());
        fecha.setText(p.getFechaEstreno());

        Uri uri= Uri.parse(p.getUrlimg());
        Picasso.with(activity).load(uri).into((Target) img);
        return v;
    }
}
