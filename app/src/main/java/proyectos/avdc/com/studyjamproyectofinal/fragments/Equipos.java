package proyectos.avdc.com.studyjamproyectofinal.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import proyectos.avdc.com.studyjamproyectofinal.POJO.EquiposItem;
import proyectos.avdc.com.studyjamproyectofinal.R;
import proyectos.avdc.com.studyjamproyectofinal.adapters.EquiposAdapter;

public class Equipos extends Fragment {

    private EquiposAdapter adapter;
    final List<EquiposItem> items = new ArrayList<EquiposItem>();
    public RecyclerView recList;

    public Equipos() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_equipos, container, false);

        recList = (RecyclerView) vista.findViewById(R.id.lstEquipos);
        recList.setHasFixedSize(true);

        GridLayoutManager llm = new GridLayoutManager(getActivity(),3);
        recList.setLayoutManager(llm);

        adapter = new EquiposAdapter(items, getActivity());
        recList.setAdapter(adapter);
        LlenarEquipos();
        return vista;
    }

    //TODO: Hacer webservices etc
    private void LlenarEquipos()
    {
       adapter.updateList(new EquiposItem(1,"Bolivar",R.drawable.boliviar));
        adapter.updateList(new EquiposItem(2,"San Jose",R.drawable.stronguest));
        adapter.updateList(new EquiposItem(3,"Guabira",R.drawable.boliviar));
        adapter.updateList(new EquiposItem(4,"The Strongest",R.drawable.stronguest));
        adapter.updateList(new EquiposItem(5,"Real Potosi",R.drawable.boliviar));
        adapter.updateList(new EquiposItem(6,"Oriente Petrolero",R.drawable.stronguest));
        adapter.updateList(new EquiposItem(7,"Wilsterman",R.drawable.boliviar));
        adapter.updateList(new EquiposItem(8,"Universitario de Sucre",R.drawable.stronguest));
        adapter.updateList(new EquiposItem(9,"Bolivar",R.drawable.boliviar));
    }
}
