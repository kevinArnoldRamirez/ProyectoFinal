package mx.edu.isc.tesoem.arnold0824.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detalles2Activity extends AppCompatActivity {

    TextView lblmatricula,lblnombre,lblcorreo,lblcalificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles2);

        lblmatricula = findViewById(R.id.dlblmatricula);
        lblnombre = findViewById(R.id.dlblnombre);
        lblcorreo = findViewById(R.id.dlblcorreo);
        lblcalificacion = findViewById(R.id.dlblcalificacion);

        String nombre = getIntent().getExtras().get("Nombre").toString();
        DatosParcelable dato= getIntent().getParcelableExtra("DatosParcelable");
        lblmatricula.setText(dato.getMaricula());
        lblnombre.setText(dato.getNombre());
        lblcorreo.setText(dato.getCorreo());
        lblcalificacion.setText(dato.getCalificacion());

        getSupportActionBar().setTitle(nombre);
    }
}
