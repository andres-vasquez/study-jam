package proyectos.avdc.com.studyjamproyectofinal.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import proyectos.avdc.com.studyjamproyectofinal.POJO.EquiposItem;
import proyectos.avdc.com.studyjamproyectofinal.POJO.PartidosItem;
import proyectos.avdc.com.studyjamproyectofinal.POJO.PosicionesItem;
import proyectos.avdc.com.studyjamproyectofinal.R;
import proyectos.avdc.com.studyjamproyectofinal.adapters.PartidosAdapter;
import proyectos.avdc.com.studyjamproyectofinal.adapters.PosicionesAdapter;

public class Posiciones extends Fragment {

    private List<PosicionesItem> items=new ArrayList<PosicionesItem>();
    private PosicionesAdapter adapter;
    private ListView lstPosiciones;

    public Posiciones() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_posiciones, container, false);
        lstPosiciones=(ListView)vista.findViewById(R.id.lstPosiciones);

        adapter=new PosicionesAdapter(items,getActivity());
        lstPosiciones.setAdapter(adapter);

        LlenarPosiciones();
        return vista;
    }

    private void LlenarPosiciones()
    {
        int contador=1;
        for(EquiposItem equipo : LlenarEquipos())
        {
            items.add(new PosicionesItem(contador,equipo,11-contador,9-contador,3+contador,1+contador,57-contador,57-contador));
            adapter.notifyDataSetChanged();
            contador++;
        }
    }

    private List<EquiposItem> LlenarEquipos()
    {
        List<EquiposItem> lstEquipos=new ArrayList<EquiposItem>();
        lstEquipos.add(new EquiposItem(1,"Bolivar",R.drawable.boliviar));
        lstEquipos.add(new EquiposItem(2,"San Jose",R.drawable.stronguest));
        lstEquipos.add(new EquiposItem(3,"Guabira",R.drawable.boliviar));
        lstEquipos.add(new EquiposItem(4,"The Strongest",R.drawable.stronguest));
        lstEquipos.add(new EquiposItem(5,"Real Potosi",R.drawable.boliviar));
        lstEquipos.add(new EquiposItem(6,"Oriente Petrolero",R.drawable.stronguest));
        lstEquipos.add(new EquiposItem(7,"Wilsterman",R.drawable.boliviar));
        lstEquipos.add(new EquiposItem(8,"Universitario de Sucre",R.drawable.stronguest));
        lstEquipos.add(new EquiposItem(9,"Bolivar",R.drawable.boliviar));
        return lstEquipos;
    }
}
