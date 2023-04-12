package cl.ejemplo.tbkdemo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.ejemplo.tbkdemo.model.Usuario;

@Repository("usuarioRepositoryJPA")
@Transactional
public interface UsuarioRepositoryJPA extends JpaRepository<Usuario, Long>{
	
	@Query("select u from Usuario u")
	public List<Usuario> listarUsuario();

}
