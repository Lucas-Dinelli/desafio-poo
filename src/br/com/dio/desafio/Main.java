package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		// Passando as caracter�sticas do objeto pelo construtor
		Curso cursoDeJava = new Curso("Curso de Java", "Aprendendo a Linguagem Java", 8);
		
		// Instanciando outro objeto, mas com o construtor vazio
		Curso cursoDePOO = new Curso();
		cursoDePOO.setTitulo("Curso de Programa��o Orientada a Objetos");
		cursoDePOO.setDescricao("O que � POO e como utilizar?");
		cursoDePOO.setCargaHoraria(5);
		
		Mentoria mentoriaDeJava = new Mentoria("Mentoria de Java", "Exemplo pr�tico com Java", LocalDate.now());
		
		System.out.println(cursoDeJava);
		System.out.println(cursoDePOO);
		System.out.println(mentoriaDeJava);

	}

}
