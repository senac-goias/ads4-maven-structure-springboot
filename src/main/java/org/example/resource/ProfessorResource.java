package org.example.resource;

import lombok.extern.slf4j.Slf4j;
import org.example.interfaces.IResource;
import org.example.model.Professor;
import org.example.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j //nos ajuda a escrever log no projeto
@RestController //inicida que é uma camada para api
@RequestMapping("api/v1/professor")
public class ProfessorResource implements IResource<Professor, Integer> {

    @Autowired //injeção de dependência
    private ProfessorService professorService;

    /**
     * Mètodo para criar T
     *
     * @param entity
     * @return
     */
    @Override
    public Professor create(Professor entity) {
        return professorService.create(entity);
    }

    /**
     * Método para consultar T baseado no identificador N informado
     *
     * @param id
     * @return
     */
    @Override
    public Professor get(Integer id) {
        return professorService.get(id);
    }

    /**
     * Retorna uma lista de T
     *
     * @return
     */
    @Override
    public List<Professor> get() {
        return professorService.get();
    }

    /**
     * Iremos passar N(id) para buscar o registro e T(entity) para atualizar o objeto;
     *
     * @param id
     * @param entity
     * @return
     */
    @Override
    public Professor update(Integer id, Professor entity) {
        return professorService.update(id,entity);
    }

    /**
     * Deleta um registro com base no identificador N(id)
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        professorService.delete(id);
    }
}
