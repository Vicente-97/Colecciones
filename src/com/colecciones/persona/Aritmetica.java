package com.colecciones.persona;

public class Aritmetica {

	public Aritmetica() {
		
	}
	 public Integer sumar(Integer numero1, Integer numero2) {
		 return numero1+numero2;
	 }
	 public Integer restar(Integer numero1, Integer numero2) {
		 if(numero1<numero2) {
			 return numero2-numero1;
		 }
		 else{
			 return numero1-numero2;
		 }
	 }
}
