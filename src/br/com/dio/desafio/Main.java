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
		
		Dev devLucas = new Dev("Lucas");
		devLucas.inscreverBootcamp(bootcampJavaDeveloper);
		
		Dev devCamila = new Dev("Camila");
		devCamila.inscreverBootcamp(bootcampJavaDeveloper);
		
		System.out.println(devLucas);
		System.out.println(devCamila);
		
		devLucas.progredir();
		devCamila.progredir();
		devCamila.progredir();
		
		inserirEspacamento();
		
		System.out.println(devLucas);	// Lucas progrediu uma vez no bootcamp
		System.out.println(devCamila);	// Camila, por sua vez, progrediu duas
		
		inserirEspacamento();
		
		devLucas.progredir();
		devCamila.progredir();
		
		System.out.println(devLucas);	// Lucas progrediu mais uma vez, faltando só a mentoria
		System.out.println(devCamila);	// Camila também progrediu e finalizou o bootcamp
		
		inserirEspacamento();
		
		System.out.println("XP de " + devLucas.getNome() + " = " + devLucas.verificarXp());
		System.out.println("XP de " + devCamila.getNome() + " = " + devCamila.verificarXp());
		
		inserirEspacamento();
		
		System.out.println(bootcampJavaDeveloper);

	}
	
	private static void inserirEspacamento() {
		System.out.println("");
		System.out.println("-".repeat(200));
		System.out.println("");
	}

}
