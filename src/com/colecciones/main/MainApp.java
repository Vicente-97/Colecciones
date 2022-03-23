package com.colecciones.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.colecciones.persona.Persona;

public class MainApp {

	public static void main(String[] args) {
		List<Persona>listaPersonas =Persona.generarListaPersona();
		Persona.OrdenarListaPersona(listaPersonas);
		System.out.println(listaPersonas);
		
		
		
	}

}
