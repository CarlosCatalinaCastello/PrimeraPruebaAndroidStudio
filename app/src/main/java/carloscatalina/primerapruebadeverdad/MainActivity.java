package carloscatalina.primerapruebadeverdad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView lblNumeroVecesMain;
    Button btnBotonMain;
    Button btnBotonResetMain;
    int cont;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cont = 0;
        inicializarVistas();
        btnBotonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont++;
                lblNumeroVecesMain.setText(String.valueOf(cont));
                if (cont == 20) {
                    Toast.makeText(MainActivity.this, "+1", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnBotonResetMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont = 0;
                lblNumeroVecesMain.setText(String.valueOf(cont));
            }
        });


    }

    private void inicializarVistas() {
        lblNumeroVecesMain = findViewById(R.id.lblNumeroVecesMain);
        btnBotonMain = findViewById(R.id.btnMasUnoMain);
        btnBotonResetMain = findViewById(R.id.btnReset);
    }

    /*
    public void contar(View view){
        cont++;
        lblNumeroVecesMain.setText(cont+" veces");
    }
    */


}