package Carros;

//Interface Operavel
	interface Operavel {
	 void ligar();
	 void desligar();
	}
	
	//Classe abstrata Veiculo
	abstract class Veiculo implements Operavel {
	 private String modelo;
	 private String marca;
	 private int ano;
	
	 public Veiculo(String modelo, String marca, int ano) {
	     this.modelo = modelo;
	     this.marca = marca;
	     this.ano = ano;
	 }
	
	 public String getModelo() {
	     return modelo;
	 }

	 public String getMarca() {
	     return marca;
	 }
	
	 public int getAno() {
	     return ano;
	 }
	}
	
	//Classe Carro que herda de Veiculo
	class Carro extends Veiculo {
	 private int portas;
	
	 public Carro(String modelo, String marca, int ano, int portas) {
	     super(modelo, marca, ano);
	     this.portas = portas;
	 }
	
	 @Override
	 public void ligar() {
	     System.out.println(getModelo() + " da " + getMarca() + " está ligado.");
	 }
	
	 @Override
	 public void desligar() {
	     System.out.println(getModelo() + " da " + getMarca() + " está desligado.");
	 }
	
	 public int getPortas() {
	     return portas;
	 }
	}
	
	//Classe Moto que herda de Veiculo
	class Moto extends Veiculo {
	 private boolean possuiSidecar;
	
	 public Moto(String modelo, String marca, int ano, boolean possuiSidecar) {
	     super(modelo, marca, ano);
	     this.possuiSidecar = possuiSidecar;
	 }
	
	 @Override
	 public void ligar() {
	     System.out.println(getModelo() + " da " + getMarca() + " está ligada.");
	 }
	
	 @Override
	 public void desligar() {
	     System.out.println(getModelo() + " da " + getMarca() + " está desligada.");
	 }
	
	 public boolean possuiSidecar() {
	     return possuiSidecar;
	 }
	}
	
	//Classe principal para testar
	public class Carros {
	 public static void main(String[] args) {
	 Veiculo carro = new Carro("Polo", "Volkswagen", 2017, 4);
	 Veiculo moto = new Moto("CG160", "Honda", 2015, false);
	
	 // Polimorfismo
	 carro.ligar();
	 moto.ligar();
	
	 // Exibindo informações
	 System.out.println("Modelo do carro: " + carro.getModelo() + ", Ano: " + carro.getAno() + ", Portas: " + ((Carro) carro).getPortas());
	 System.out.println("Modelo da moto: " + moto.getModelo() + ", Ano: " + moto.getAno() + ", Possui sidecar: " + ((Moto) moto).possuiSidecar());
	
	     carro.desligar();
	     moto.desligar();
	 }
}