package br.com.pousadaypua.ProjectPousadaYpua;

import br.com.pousadaypua.ProjectPousadaYpua.entity.Usuario;
import br.com.pousadaypua.ProjectPousadaYpua.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectPousadaYpuaApplicationTests {

	@Autowired
	private UsuarioRepository repo;

	@Test
	void contextLoads() {

		Usuario u = new Usuario();
		u.setCpf("2324234");

		repo.save(u);
	}

}
