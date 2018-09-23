package desarrollojhlibreros.com.ejercicio4fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentDetalle extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b) {
        return inflater.inflate(R.layout.fragment_fragment_detalle, container, false);
    }
    public void mostrarDetalle(String texto) {
        TextView tv = (TextView)getView().findViewById(R.id.xtvDetalle);
        tv.setText(texto);
    }
}
