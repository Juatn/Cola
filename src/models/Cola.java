package models;

import java.util.Arrays;

public class Cola<T> {
	/* Atributos */
	private T[] cola;

	/* Constructor */
	public Cola() {

		this.cola = (T[]) new Object[0];

	}

	/* Metodos */

	@Override
	public String toString() {
		return "Cola [cola=" + Arrays.toString(cola) + "]";
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
	public void clear() {
		this.cola = (T[]) new Object[0];
	}

	/***
	 * Elimina primer elemento cola
	 * 
	 * @return
	 */
	public T pop() {

		T elemento = this.cola[0];
		remove(elemento);
		return elemento;

	}

	/***
	 * Elimina de la cola el elemento
	 * 
	 * @param element
	 */
	public void remove(T element) {

		for (int i = 0; i < this.cola.length; i++) {
			if (this.cola[i] == element) {
				this.cola[i] = null;
			}
		}
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
