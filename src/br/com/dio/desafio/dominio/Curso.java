package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	private Integer cargaHoraria;
	
	public Curso() {
	}

	public Curso(String titulo, String descricao, Integer cargaHoraria) {
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * getCargaHoraria();
	}
	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", cargaHoraria = " + getCargaHoraria() + "]";
	}
	
}
