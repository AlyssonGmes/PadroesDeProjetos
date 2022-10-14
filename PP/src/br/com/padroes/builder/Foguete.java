package br.com.padroes.builder;

public class Foguete {
    private String modelo;
    private String tipoMotor;
    private String tipoCombustivel;
    private double capacidadeTanqueCombustivel;
    private short totalAssentos;
    private double velocidadeMaxima;
    private double peso;
    private double altura;
    private String fabricante;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getCapacidadeTanqueCombustivel() {
        return capacidadeTanqueCombustivel;
    }

    public void setCapacidadeTanqueCombustivel(double capacidadeTanqueCombustivel) {
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    public short getTotalAssentos() {
        return totalAssentos;
    }

    public void setTotalAssentos(short totalAssentos) {
        this.totalAssentos = totalAssentos;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        if (totalAssentos == 0) {
            return "Modelo: " + modelo + "\nMotor: " + tipoMotor + "\nCombustível: " + tipoCombustivel + "\nCapacidade do Tanque: " + capacidadeTanqueCombustivel +
                    " litros"+                    "\nVelocidade maxima: " + velocidadeMaxima +
                    " km/h\nPeso: " + peso +
                    " kgs\nAltura: " + altura +
                    " metros\nFabricante: " + fabricante + "\n";
        } else {
            return "Modelo: " + modelo + "\nMotor: " + tipoMotor + "\nCombustível: " + tipoCombustivel + "\nCapacidade do Tanque: " + capacidadeTanqueCombustivel +
                    " litros\nNúmero de assentos: " + totalAssentos +
                    "\nVelocidade maxima: " + velocidadeMaxima +
                    " km/h\nPeso: " + peso +
                    " kgs\nAltura: " + altura +
                    " metros\nFabricante: " + fabricante + "\n";
        }
    }
}
