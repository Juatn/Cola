package test;

import java.util.Scanner;

import models.Cola;

public class test {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 6;
		int num3 = 10;

		int num4 = 20;

		Cola prueba = new Cola();

		prueba.push(num1);
		prueba.push(num2);
		prueba.push(num3);
		prueba.push(num4);
		
		System.out.println(prueba.toString()); //el push funciona
		
		prueba.remove(num2);
		
		System.out.println(prueba.toString()); //el remove a medias 
		
		System.out.println(prueba.contains(num1)); //funciona
		
		
		System.out.println(prueba.size()); //funciona
		
		System.out.println(prueba.pop().toString()); //funciona
		
		System.out.println(prueba.isEmpty());  //funciona
		
		

	}
}
