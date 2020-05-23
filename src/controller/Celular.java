package controller;

public class Celular {
	//Atributos
	String modelo;
	String cor;
	int altura;
	boolean sentado;
	
	//construtor	
	public Celular(String modelo, int altura, String cor, boolean sentado) {
		super();
		this.modelo = modelo;
		
		this.cor = cor;
		this.altura = altura;
		this.sentado = sentado;
	}
	
	//Metodos
	public void status(){
	
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.cor);
		System.out.println("Altura: " + this.altura + "cm");
		System.out.println("----STATUS------" );
		
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public boolean isSentado() {
		return sentado;
	}

	public void setSentado(boolean sentado) {
		this.sentado = sentado;
	}

	public void sentar(){
		if(sentado ==true){
			System.out.println("Celular ocupado!");
		}else{
			System.out.println("Aguarde chamando ...");
			
		}
	}
	public void usando(){
		this.sentado=true;
	}

}
