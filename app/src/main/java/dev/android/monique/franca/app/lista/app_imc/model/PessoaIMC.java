package dev.android.monique.franca.app.lista.app_imc.model;

public class PessoaIMC {
    private double peso;
    private double altura;


    public PessoaIMC(){
    }
    public PessoaIMC(double peso, double altura){
        this.peso =peso;
        this.altura=altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double resultadoIMC(double peso, double altura){
        double resultadoIMC = ((peso)/(altura*altura));
        return  resultadoIMC;
    }
}
