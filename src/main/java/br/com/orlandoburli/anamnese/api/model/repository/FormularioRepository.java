package br.com.orlandoburli.anamnese.api.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.orlandoburli.anamnese.api.model.entity.Formulario;

public interface FormularioRepository extends PagingAndSortingRepository<Formulario, Integer> {

}
