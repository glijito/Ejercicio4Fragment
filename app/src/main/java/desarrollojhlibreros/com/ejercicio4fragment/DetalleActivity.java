package desarrollojhlibreros.com.ejercicio4fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    public static final String EXTRA_TEXTO = "com.example.escom.fragmentos.EXTRA_TEXTO";
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_detalle);
        FragmentDetalle fd = (FragmentDetalle) getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);
    }
}



