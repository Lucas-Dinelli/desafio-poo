package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Bootcamp {
	
	private String nome;
	private String descricao;
	private Set<Dev> devsInscritos;
	private Set<Conteudo> conteudos;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	
	public Bootcamp(String nome, String descricao) {
		this.setNome(nome);
		this.setDescricao(descricao);
		devsInscritos = new HashSet<>();
		conteudos = new LinkedHashSet<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

	@Override
	public String toString() {
		return "Bootcamp [nome = " + getNome() + ", descricao = " + getDescricao()
				
				+ ", devsInscritos = "
				
				+ getDevsInscritos()
					.stream()
					.map(Dev::getNome)
					.collect(Collectors.toList())
					
				+ ", conteudos = "
				
				+ getConteudos()
					.stream()
					.map(Conteudo::getTitulo)
					.collect(Collectors.toList())
				
				+ ", dataInicial = " + getDataInicial() 
				+ ", dataFinal = " + getDataFinal() + "]";
	}
	
}
