package ar.com.edu.tp1;

public class Circulo {
	
	//atributos
	private Double radio;
	private Double perimetro;
	
	//metodos
	
	public double calculoPerimetro()
	{
		perimetro=2*Math.PI*radio;
		
		return perimetro;
	}
	
	
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}


}
