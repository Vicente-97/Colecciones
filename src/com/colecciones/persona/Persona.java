package com.colecciones.persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private String apellido;
	private LocalDate fecha_nacimiento;
	
	
	public Persona(String nombre, String apellido, LocalDate fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
		public static List<Persona> generarListaPersona() {
			
			
			List<Persona> listaPersonas =new ArrayList<Persona>();
			listaPersonas.add(new Persona("Juan", "Villarreal", LocalDate.of(2000, 07, 03)));
			listaPersonas.add(new Persona("Manolo", "Rosario", LocalDate.of(2000, 05, 03)));
			listaPersonas.add(new Persona("Vicente", "Azahar", LocalDate.of(2000, 02, 03)));
			
			return listaPersonas;
			
		}
		
		public static List<Persona> OrdenarListaPersona(List<Persona> persona) {
			if (persona != null) {
			Collections.sort(persona);
			}
			return persona;
			
		}
		
		public boolean esMayorDeEdad() {
			
			if(this.fecha_nacimiento!=null) {
				this.getFecha_nacimiento().getYear()-LocalDate.now().getYear();
			}
			
			return false;
		}
		
		public static List<Persona> generarPersonasConBucle() {
			List<Persona> listaPersonas2 =new ArrayList<Persona>();
			Scanner sc = new Scanner(System.in);
			System.out.println("Dinos tu apellido");
			
			for(int i =0; i<10; i++) {
				listaPersonas2.add(new Persona(null, null, null));
			}
			
			return listaPersonas2;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento=" + fecha_nacimiento
					+ "]";
		}

		public String getNombre() {
			return nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public LocalDate getFecha_nacimiento() {
			return fecha_nacimiento;
		}
		

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
			this.fecha_nacimiento = fecha_nacimiento;
		}

		@Override
		public int compareTo(Persona otro) {
			int resultado=0;
			if(this.getApellido()==null || otro.getApellido()==null) {
				resultado=0;
			}else if (this.getApellido().compareTo(otro.getApellido())>0) {
				resultado=1;
			}else if (this.getApellido().compareTo(otro.getApellido())<0) {
				resultado=-1;
				
			}
			
				
			
			return resultado;
		}

		@Override
		public int hashCode() {
			return Objects.hash(apellido, fecha_nacimiento, nombre);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Persona other = (Persona) obj;
			return Objects.equals(apellido, other.apellido) && Objects.equals(fecha_nacimiento, other.fecha_nacimiento)
					&& Objects.equals(nombre, other.nombre);
		}
		
		
		
	}
	
	
	
	

