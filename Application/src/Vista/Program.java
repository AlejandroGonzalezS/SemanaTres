package Vista;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
                
                //Declaración de un objeto Scanner, el cuál obtiene los datos 
		//desde la entrada de la ventana de comandos System.in(InputStream).
		Scanner leer = new Scanner(System.in);
                
                //Declaración de variables de los datos solicitados
                String nombre;
                int edad;
                String marca;
                String modelo;
                int cilindrada;
                String tipoCombustible;
                int cantPasajeros;
                
                //Lineas de mensajes de salida.
		System.out.println("Bienvenido a ...");
		System.out.println("");
		
		System.out.print("Ingrese su nombre: ");
                //Lectura de cadena de caracteres, se asigna a la variable nombre
                nombre = leer.next();
		System.out.println("");
                
		System.out.print("Ingrese su edad: ");
                //Lectura de número entero, se asigna a la variable edad
		edad = leer.nextInt();
		System.out.println("");
                
                System.out.print("Ingrese marca del vehículo: ");
                //Lectura de cadena de caracteres, se asigna a la variable marca
                marca = leer.next();
                System.out.println("");
                
                System.out.print("Ingrese modelo del vehículo: ");
                //Lectura de cadena de caracteres, se asigna a la variable modelo
                modelo = leer.next();
                System.out.println("");
                
                System.out.print("Ingrese cilindrada del vehículo: ");
                //Lectura de número entero, se asigna a la variable cilidrada
                cilindrada = leer.nextInt();
                System.out.println("");
                
                System.out.print("Ingrese tipo de combustible del vehículo: ");
                //Lectura de cadena de caracteres, se asigna a la variable tipoCombustible
                tipoCombustible = leer.next();
                System.out.println("");
                
                System.out.print("Ingrese cantidad de passajeros del vehículo: ");
                //Lectura de número entero, se asigna a la variable cantPasajeros
                cantPasajeros = leer.nextInt();
                System.out.println("");
                
                System.out.println("--------------------------------------");
                
                //Imprimir por pantalla el contenido de la variable nombre
                System.out.println("Nombre: " + nombre);
                System.out.println("");
                
                //Imprimir por pantalla el contenido de la variable edad
                System.out.println("Edad: " + edad);
                System.out.println("");
                
                //Imprimir por pantalla el contenido de la variable marca
                System.out.println("La marca que ha ingresado es: " + marca);
                System.out.println("");
                
                //Imprimir por pantalla el contenido de la variable modelo
                System.out.println("El modelo que ha ingresado es: " + modelo);
                System.out.println("");
                
                //Imprimir por pantalla el contenido de la variable cilindrada
                System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
                System.out.println("");
                
                //Imprimir por pantalla el contenido de la variable tipoCombustible
                System.out.println("El tipo de combustible es: " + tipoCombustible);
                System.out.println("");
                
                //Imprimir por pantalla el contenido de la variable cantPasajeros 
                System.out.println("Tiene una capacidad de " + cantPasajeros + " pasajeros");
                System.out.println("");
	}
}