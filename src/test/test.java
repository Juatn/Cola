package test;

import java.util.Scanner;

import models.Cola;

public class test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 6;
		int num3 = 10;

		int num4 = 20;

		@SuppressWarnings("rawtypes")
		Cola prueba = new Cola();

		prueba.push(num1);
		prueba.push(num2);
		prueba.push(num3);
		prueba.push(num4);

		System.out.println("Cola con el push 4 elementos. ");
		System.out.println(prueba.toString()); 
		System.out.println("Eliminamos el 'num2', que corresponde al numero 6");
		prueba.remove(num2);
		System.out.println(prueba.toString()); 
		System.out.println("Comprobamos que contiene el elemento 'num1' que es el 5, nos dara true");
		System.out.println(prueba.contains(num1)); 
		System.out.println("Nos dice el tamano de la cola actual");
		System.out.println(prueba.size()); 
		System.out.println("Eliminamos el primer elemento de la cola (el 5)");
		prueba.pop();
		System.out.println(prueba.toString());
		System.out.println("Eliminamos el ultimo elemento de la cola(el 20)");
		prueba.poplifo();
		System.out.println(prueba.toString()); 
		System.out.println("Comprobamos que este vacia (deberia dar false)");
		System.out.println(prueba.isEmpty()); 
		System.out.println("Eliminamos todos los elementos de la cola y lo dejamos vacio");
		prueba.clear();
		System.out.println(prueba.toString());
		System.out.println("Comprobamos ahora si esta vacia la cola");
		System.out.println(prueba.isEmpty());

	}
}
