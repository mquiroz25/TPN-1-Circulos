package ar.com.edu.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCirculos {

	@Test
	public void testRadioCirculo1() {
		
		Circulo miCirculo = new Circulo();
		
		miCirculo.setRadio(2.0);
		
		double valorRadio;
		valorRadio= miCirculo.getRadio();
assertEquals(2.0, valorRadio, 0.01);
		}

	@Test
	public void testRadioCirculo2() {
		
		Circulo miCirculo = new Circulo();
		
		miCirculo.setRadio(3.7);
		
		double valorRadio;
		valorRadio= miCirculo.getRadio();
assertEquals(3.7, valorRadio, 0.01);
		}
	
	@Test
	public void testRadioCirculo3() {
		
		Circulo miCirculo = new Circulo();
		
		miCirculo.setRadio(5.0);
		
		double valorRadio;
		valorRadio= miCirculo.getRadio();
assertEquals(5.0, valorRadio, 0.01);
		}
	
	
	@Test
	public void testRadioCirculo4() {
		
		Circulo miCirculo = new Circulo();
		
		miCirculo.setRadio(10.9);
		
		double valorRadio;
		valorRadio= miCirculo.getRadio();
assertEquals(10.9, valorRadio, 0.01);
		}
	
	
	
	
	@Test
	public void testPerimetroCirculo5() {
		
		Circulo miCirculo = new Circulo();
		
		miCirculo.setRadio(9.8);
		
		double perimetro;
		perimetro = miCirculo.calculoPerimetro();
assertEquals(61.57, perimetro, 0.01);
		}

	@Test
	public void testPerimetroCirculo6() {
		
		Circulo miCirculo = new Circulo();
		
		miCirculo.setRadio(16.6);
		
		double perimetro;
		perimetro = miCirculo.calculoPerimetro();
assertEquals(104.3, perimetro, 0.01);
		
		
		
	}

}
