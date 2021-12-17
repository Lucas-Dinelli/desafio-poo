package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosInscritos;
	private Set<Conteudo> conteudosConcluidos;
	
	public Dev(String nome) {
		this.nome = nome;
		conteudosInscritos = new LinkedHashSet<>();
		conteudosConcluidos = new LinkedHashSet<>();
	}
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.getConteudosInscritos().addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.getConteudosInscritos().stream().findFirst();
		if(conteudo.isPresent()) {
			this.getConteudosConcluidos().add(conteudo.get());
			this.getConteudosInscritos().remove(conteudo.get());
		}
	}
	
	public Double verificarXp() {
		return this.getConteudosConcluidos().stream()
					.mapToDouble(Conteudo::calcularXp)
					.sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

	@Override
	public String toString() {
		return "Dev [nome = " + getNome() 
				
				+ ", conteudosInscritos = "
				
				+ getConteudosInscritos()
					.stream()
					.map(Conteudo::getTitulo)
					.collect(Collectors.toList())
					
				+ ", conteudosConcluidos = "
				
				+ getConteudosConcluidos()
					.stream()
					.map(Conteudo::getTitulo)
					.collect(Collectors.toList())
				
				+ "]";
	}
	
}
