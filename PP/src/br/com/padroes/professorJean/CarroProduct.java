package br.com.padroes.professorJean;

public class CarroProduct {
  public double preco;
  public String dscMotor;
  public int anoDeFabricacao;
  public String modelo;
  public String montadora;
  public String opcional;

  @Override
  public String toString() {
    if(opcional != null) {
      return "Preco: " + preco +
              "\nMotor:" + dscMotor + "Fabricação: " + anoDeFabricacao +
              "\nModelo: " + modelo + "\nMontadora: " + montadora + "\nOpcional: " + opcional + "\n";

    }else{
      return  "Preco: " + preco +
              "\nMotor:" + dscMotor + "Fabricação: " + anoDeFabricacao +
              "\nModelo: " + modelo + "\nMontadora: " + montadora + "\n";
    }

  }
}