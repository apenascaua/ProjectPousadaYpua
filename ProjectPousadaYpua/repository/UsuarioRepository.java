package br.com.pousadaypua.ProjectPousadaYpua.repository;

import br.com.pousadaypua.ProjectPousadaYpua.entity.Usuario;

import br.com.pousadaypua.ProjectPousadaYpua.entity.UsuarioType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



}
