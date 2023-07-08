package dev.android.monique.franca.app.lista.app_imc.view.layout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import dev.android.monique.franca.app.lista.app_imc.R;
import dev.android.monique.franca.app.lista.app_imc.model.PessoaIMC;


public class MainActivity extends AppCompatActivity {
        PessoaIMC pessoaIMC;

        EditText editPeso;
        EditText editAltura;

        Button btnButton_calcular;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            pessoaIMC = new PessoaIMC();
            pessoaIMC.setPeso(70.0);
            pessoaIMC.setAltura(1.80);
            pessoaIMC.resultadoIMC(pessoaIMC.getPeso(), pessoaIMC.getAltura());

            editPeso = findViewById(R.id.text_peso);
            editAltura = findViewById(R.id.text_altura);


            editAltura.setText(Double.toString(pessoaIMC.getAltura()));
            editPeso.setText(Double.toString(pessoaIMC.getPeso()));

        }

}