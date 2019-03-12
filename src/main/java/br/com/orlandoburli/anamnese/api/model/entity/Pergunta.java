package br.com.orlandoburli.anamnese.api.model.entity;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pergunta {

	@EqualsAndHashCode.Include
	private String texto;

	private TipoPergunta tipoPergunta;

	private boolean obrigatorio;

	private int minimoRespostas;

	private int maximoRespostas;

	private Set<Resposta> respostas;
}