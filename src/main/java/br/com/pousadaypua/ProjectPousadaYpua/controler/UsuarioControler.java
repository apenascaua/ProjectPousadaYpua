package br.com.pousadaypua.ProjectPousadaYpua.controler;


import br.com.pousadaypua.ProjectPousadaYpua.entity.Usuario;
import br.com.pousadaypua.ProjectPousadaYpua.repository.UsuarioRepository;
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

    @PutMapping("/usuario/{id}")
    public void update (@PathVariable(value = "id") Long usuarioId, @RequestBody Usuario usuarioDetails) {
        usuarioRepository.save(usuarioDetails);
        System.out.println("Rodou o Put");

//        Usuario usuario = usuarioRepository.findById(usuarioId).get();
//        Usuario usuario = usuarioRepository.findById(usuarioId).get();
//        usuario.setNome(usuarioDetails.getNome());
//       usuario.setUsuarioType(usuarioDetails.getUsuarioType());

    }

    @GetMapping("/usuario/{id}")
    public Usuario getById(@PathVariable (value = "id") Long usuarioId) {
     Usuario usuario = usuarioRepository.findById(usuarioId).get();
        System.out.println("Rodou o GetById");
        return usuario;

     }


    @DeleteMapping("/usuario/{id}")
    public void delete(@PathVariable(value = "id") Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
        System.out.println("Rodou o Delete");


    }

 



}
