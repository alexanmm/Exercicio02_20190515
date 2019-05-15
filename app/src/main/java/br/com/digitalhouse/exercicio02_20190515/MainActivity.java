package br.com.digitalhouse.exercicio02_20190515;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextPreco;
    EditText editTextPercentual;
    Button botaoTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPreco = findViewById(R.id.editTextPreco);
        editTextPercentual = findViewById(R.id.editTextPercentual);
        botaoTotal = findViewById(R.id.buttonValorTotal);

        botaoTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    float valorTotal;

                    valorTotal =
                            Float.valueOf(editTextPreco.getText().toString()) *
                                    (1 - (Float.parseFloat(editTextPercentual.getText().toString()) / 100));

                    Toast.makeText(MainActivity.this, "Valor Total: " + valorTotal, Toast.LENGTH_LONG).show();
                } catch (Exception ex){

                }


            }
        });


    }
}
