package com.jonathanlucena.cursomc.service;

import com.jonathanlucena.cursomc.domain.Categoria;
import com.jonathanlucena.cursomc.repositories.CategoriaRepository;
import com.jonathanlucena.cursomc.service.exceptions.DataIntegrityException;
import com.jonathanlucena.cursomc.service.exceptions.ObjectNotFoundException;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

    public Categoria insert(Categoria obj){
        obj.setId(null);
        return repo.save(obj);
    }

    public Categoria update(Categoria obj){
        find(obj.getId());
        return repo.save(obj);
    }

    public void delete(Integer id){
        find(id);
        try{
        repo.deleteById(id);
    }
        catch (DataIntegrityViolationException e) {
            throw new DataIntegrityException("Não é possível excluir uma categoria que possuí produtos");
        }

        }
}
