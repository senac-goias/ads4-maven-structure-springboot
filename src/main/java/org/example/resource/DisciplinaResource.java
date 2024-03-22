package org.example.resource;

import lombok.extern.slf4j.Slf4j;
import org.example.interfaces.IResource;
import org.example.model.Disciplina;
import org.example.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j //nos ajuda a escrever log no projeto
@RestController //inicida que é uma camada para api
@RequestMapping("api/v1/disciplina")
public class DisciplinaResource implements IResource<Disciplina, Integer> {

    @Autowired //injeção de dependência
    private DisciplinaService disciplinaService;

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
