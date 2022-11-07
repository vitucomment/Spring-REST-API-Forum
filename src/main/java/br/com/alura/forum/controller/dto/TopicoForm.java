package br.com.alura.forum.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;

public class TopicoForm {

	final String MESSAGE_TITULO = "Minimo de 5 characters";
	final String MESSAGE_MENSAGEM = "Minimo de 10 characters";

	@NotNull @NotEmpty @Size(min = 5, message = MESSAGE_TITULO)
	private String titulo;
	@NotNull @NotEmpty @Size(min = 10, message = MESSAGE_MENSAGEM)
	private String mensagem;
	@NotNull @NotEmpty
	private String nomeCurso;
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Topico toTopico(CursoRepository repository) {
		Curso curso = repository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}

}
