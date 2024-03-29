package org.example.resource;

import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.example.interfaces.IResource;
import org.example.model.Aluno;
import org.example.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j //nos ajuda a escrever log no projeto
@RestController //inicida que é uma camada para api
@RequestMapping("api/v1/aluno")
public class AlunoResource implements IResource<Aluno, Integer> {

    @Autowired //faz a injeção de dependência
    private AlunoService alunoService;

    /**
     * Mètodo para criar T
     *
     * @param entity
     * @return
     */
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE,
                        MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Aluno create(@RequestBody Aluno entity) {

        log.info("Cadastro do aluno iniciado");
        log.debug("Informações do aluno: {}", entity);

        return alunoService.create(entity);
    }

    /**
     * Método para consultar T baseado no identificador N informado
     *
     * @param id
     * @return
     */
    @GetMapping(
            value = "/{id}", //http://localhost:8080/api/v1/aluno/1
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @Override
    public Aluno get(@PathVariable("id") Integer id) {
        return alunoService.get(id);
    }

    /**
     * Retorna uma lista de T
     *
     * @return
     */
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<Aluno> get() {
        return alunoService.get();
    }

    /**
     * Iremos passar N(id) para buscar o registro e T(entity) para atualizar o objeto;
     *
     * @param id
     * @param entity
     * @return
     */
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Aluno update(@PathVariable Integer id, @RequestBody Aluno entity) {
        return alunoService.update(id, entity);
    }

    /**
     * Deleta um registro com base no identificador N(id)
     *
     * @param id
     */
    @DeleteMapping(value = "/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        alunoService.delete(id);
    }
}
