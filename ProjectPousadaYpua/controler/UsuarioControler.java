package br.com.pousadaypua.ProjectPousadaYpua.controler;


import br.com.pousadaypua.ProjectPousadaYpua.entity.Usuario;
import br.com.pousadaypua.ProjectPousadaYpua.repository.UsuarioRepository;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UsuarioControler {

    @Autowired //Isso puxa a injeção feita no UsuarioRepository com os dados do banco
    private UsuarioRepository usuarioRepository;

    @RequestMapping("/usuario")
    public List<Usuario> getAll() {
        System.out.println("Rodou o GetAll");
        return usuarioRepository.findAll();
    }

    @PostMapping("/usuario")
    public Usuario create(@RequestBody Usuario usuario) {
        System.out.println("Rodou o Create");
        return usuarioRepository.save(usuario); //já que eu quero criar ele tem que salvar os usuarios

    }

    @DeleteMapping("/usuario")
    public void delete(@RequestBody Usuario usuario) {
        System.out.println("Rodou o Delete");


    }







}
