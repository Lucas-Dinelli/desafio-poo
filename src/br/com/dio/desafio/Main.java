package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		// Passando as características do objeto pelo construtor
		Curso cursoDeJava = new Curso("Curso de Java", "Aprendendo a Linguagem Java", 8);
		
		// Instanciando outro objeto, mas com o construtor vazio
		Curso cursoDePOO = new Curso();
		cursoDePOO.setTitulo("Curso de Programação Orientada a Objetos");
		cursoDePOO.setDescricao("O que é POO e como utilizar?");
		cursoDePOO.setCargaHoraria(5);
		
		Mentoria mentoriaDeJava = new Mentoria("Mentoria de Java", "Exemplo prático com Java", LocalDate.now());
		
//		System.out.println(cursoDeJava);
//		System.out.println(cursoDePOO);
//		System.out.println(mentoriaDeJava);
		
		inserirEspacamento();
		
		Bootcamp bootcampJavaDeveloper = new Bootcamp("Bootcamp Java Developer", "Imersão completa na linguagem Java");
		bootcampJavaDeveloper.getConteudos().add(cursoDePOO);
		bootcampJavaDeveloper.getConteudos().add(cursoDeJava);
		bootcampJavaDeveloper.getConteudos().add(mentoriaDeJava);
		
		Dev primeiroDev = new Dev("Lucas");
		primeiroDev.inscreverBootcamp(bootcampJavaDeveloper);
		
		Dev segundoDev = new Dev("Camila");
		segundoDev.inscreverBootcamp(bootcampJavaDeveloper);
		
		System.out.println(primeiroDev);
		System.out.println(segundoDev);
		
		primeiroDev.progredir();
		segundoDev.progredir();
		segundoDev.progredir();
		
		inserirEspacamento();
		
		System.out.println(primeiroDev);	// Lucas progrediu uma vez no bootcamp
		System.out.println(segundoDev);	// Camila, por sua vez, progrediu duas
		
		inserirEspacamento();
		
		primeiroDev.progredir();
		segundoDev.progredir();
		
		System.out.println(primeiroDev);	// Lucas progrediu mais uma vez, faltando só a mentoria
		System.out.println(segundoDev);	// Camila também progrediu e finalizou o bootcamp
		
		inserirEspacamento();
		
		System.out.println("XP de " + primeiroDev.getNome() + " = " + primeiroDev.verificarXp());
		System.out.println("XP de " + segundoDev.getNome() + " = " + segundoDev.verificarXp());
		
		inserirEspacamento();
		
		System.out.println(bootcampJavaDeveloper);

	}
	
	private static void inserirEspacamento() {
		System.out.println("");
		System.out.println("-".repeat(200));
		System.out.println("");
	}

}
