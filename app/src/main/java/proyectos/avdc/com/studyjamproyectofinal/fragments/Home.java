package proyectos.avdc.com.studyjamproyectofinal.fragments;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import proyectos.avdc.com.studyjamproyectofinal.POJO.PartidosItem;
import proyectos.avdc.com.studyjamproyectofinal.R;
import proyectos.avdc.com.studyjamproyectofinal.adapters.PartidosAdapter;

public class Home extends Fragment {

    private PartidosAdapter adapter;
    final List<PartidosItem> items = new ArrayList<PartidosItem>();
    public RecyclerView recList;

    public Home() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_home, container, false);

        recList = (RecyclerView) vista.findViewById(R.id.lstPartidos);
        recList.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        adapter = new PartidosAdapter(items, getActivity());
        recList.setAdapter(adapter);
        LlenarPartidos();
        return vista;
    }

    //TODO: Hacer webservices etc
    private void LlenarPartidos()
    {
        PartidosItem partido1=new PartidosItem(1,"Bolivar","The Stronguest","3 - 1","1T 35:31",R.drawable.boliviar,R.drawable.stronguest);
        adapter.updateList(partido1);
        PartidosItem partido2=new PartidosItem(2,"San Jose","The Stronguest","1 - 1","Finalizado",R.drawable.boliviar,R.drawable.stronguest);
        adapter.updateList(partido2);
        PartidosItem partido3=new PartidosItem(3,"Guabira","Real Potosi","20:30 Hrs.","Ene 12, 2015",R.drawable.stronguest,R.drawable.boliviar);
        adapter.updateList(partido3);
        PartidosItem partido4=new PartidosItem(4,"Bolivar","Wilsterman","20:30 Hrs.","Ene 12, 2015",R.drawable.stronguest,R.drawable.boliviar);
        adapter.updateList(partido4);
    }
}
