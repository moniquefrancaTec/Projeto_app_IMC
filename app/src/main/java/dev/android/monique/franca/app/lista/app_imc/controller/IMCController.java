package dev.android.monique.franca.app.lista.app_imc.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import dev.android.monique.franca.app.lista.app_imc.model.PessoaIMC;
import dev.android.monique.franca.app.lista.app_imc.view.layout.MainActivity;

public class IMCController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;

    public  static  final  String NOME_PREFERENCES ="pref_listavip";

    public IMCController (MainActivity activity){
        super(activity);

        preferences = activity.getSharedPreferences(NOME_PREFERENCES,0);
        listaVip = preferences.edit();

    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciada....");
        return super.toString();
    }
    public void salvar(PessoaIMC pessoaIMC) {
        /*Log.d("MVC_Controller", "Salvo: "+combustivel.toString());
        listaVip.putString("precoGasolina", String.valueOf(combustivel.getPrecoGasolina()));
        listaVip.putString("precoEtanol", String.valueOf(combustivel.getPrecoEtanol()));
        listaVip.putString("Resultado", String.valueOf(combustivel.getResultado()));
        listaVip.apply();


        ContentValues dados = new ContentValues();
        dados.put("precoGasolina", combustivel.getPrecoGasolina());
        dados.put("precoEtanol", combustivel.getPrecoEtanol());
        dados.put("resultado", combustivel.getResultado());
        salvarDados("Combustive",dados);*/

    }


    public  void limpar(PessoaIMC pessoaIMC){
        listaVip.clear();
        listaVip.apply();
    }

    public  String calcular(PessoaIMC pessoaIMC){

        /*double precoGasolina = combustivel.getPrecoGasolina();
        double precoEtanol = combustivel.getPrecoEtanol();
        double resultado = (precoEtanol/ precoGasolina)*100;
        String frase;

        if (resultado <=70){
            frase = String.format("Resultado: Melhor opção - Etanol  %.2f",resultado);
        } else {
            frase =String.format("Resultado: Melhor opção - Gasolina %.2f", resultado);
        }
        return frase;*/


    }



}
