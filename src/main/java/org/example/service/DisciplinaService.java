package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.interfaces.IService;
import org.example.model.Disciplina;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j //nos ajuda a escrever log no projeto
@Service //indica que é uma camada de serviço(negócio)
public class DisciplinaService implements IService<Disciplina, Integer> {


    /**
     * Mètodo para criar T
     *
     * @param entity
     * @return
     */
    @Override
    public Disciplina create(Disciplina entity) {
        return null;
    }

    /**
     * Método para consultar T baseado no identificador N informado
     *
     * @param id
     * @return
     */
    @Override
    public Disciplina get(Integer id) {
        return null;
    }

    /**
     * Retorna uma lista de T
     *
     * @return
     */
    @Override
    public List<Disciplina> get() {
        return null;
    }

    /**
     * Iremos passar N(id) para buscar o registro e T(entity) para atualizar o objeto;
     *
     * @param id
     * @param entity
     * @return
     */
    @Override
    public Disciplina update(Integer id, Disciplina entity) {
        return null;
    }

    /**
     * Deleta um registro com base no identificador N(id)
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {

    }
}
