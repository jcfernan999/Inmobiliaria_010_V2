package com.example.inmobiliaria_010.ui.pagos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.inmobiliaria_010.R;


public class PagosFragment extends Fragment {



    public PagosFragment() {
        // Required empty public constructor
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_propiedades, container, false);

        final ListView lvProdiedad = view.findViewById(R.id.lvPropiedad);

        lvProdiedad.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Bundle bundle  = new Bundle();
                String pos;
                pos =  Integer.toString(position);
                bundle.putString("item",pos);
                Navigation.findNavController(view).navigate(R.id.nav_detalle_pago, bundle);
            }
        });
        return view;
    }

}
