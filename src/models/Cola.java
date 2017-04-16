package models;

import java.util.Arrays;

public class Cola<T> {
	/* Atributos */
	private T[] cola;

	/* Constructor */
	@SuppressWarnings("unchecked")
	public Cola() {

		this.cola = (T[]) new Object[0];

	}

	/* Metodos */

	/**
	 * para imprimir la cola
	 * 
	 */
	@Override
	public String toString() {
		return "Cola =" + Arrays.toString(cola) + "\n";
	}

	/**
	 * Devuelve tamaño del array
	 * 
	 * @return
	 */
	public int size() {
		return this.cola.length;
	}

	/**
	 * Devuelve true si el array esta vacio.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (this.cola.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Devuelve true si el elemento está en la colección utilizando el equals de
	 * la clase T
	 **/
	public boolean contains(T element) {
		for (int i = 0; i < this.cola.length; i++) {
			if (this.cola[i].equals(element))
				return true;
		}
		return false;
	}

	/**
	 * Elimina todos los elementos y deja el array en 0
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void clear() {
		this.cola = (T[]) new Object[0];
	}

	/**
	 * Elimina ultimo elemento cola(lifo)
	 * 
	 */
	public void poplifo() {
		T elemento = this.cola[this.cola.length - 1];
		remove(elemento);
	}

	/***
	 * Elimina primer elemento cola (fifo)
	 */
	public void pop() {

		T elemento = this.cola[0];

		remove(elemento);

	}

	/***
	 * Elimina de la cola el elemento
	 * 
	 * @param element
	 */
	@SuppressWarnings("unchecked")
	public void remove(T element) {
		T[] aux = (T[]) new Object[this.cola.length - 1];

		int j = 0;
		for (int i = 0; i < this.cola.length; i++) {
			if (this.cola[i] != element) {
				aux[j] = this.cola[i];
				j++;
			}

		}
		this.cola = aux;
	}

	/***
	 * Añade el elemento al array
	 * 
	 * @param element
	 */
	@SuppressWarnings("unchecked")
	public void push(T element) {
		T[] aux = (T[]) new Object[this.cola.length + 1];

		for (int i = 0; i < this.cola.length; i++) {
			aux[i] = this.cola[i];
		}

		aux[aux.length - 1] = (T) element;

		this.cola = aux;
	}

}
