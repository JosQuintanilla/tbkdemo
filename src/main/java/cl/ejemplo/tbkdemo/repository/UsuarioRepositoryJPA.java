package cl.ejemplo.tbkdemo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.ejemplo.tbkdemo.model.Usuario;

@Repository("usuarioRepositoryJPA")
@Transactional
public interface UsuarioRepositoryJPA extends JpaRepository<Usuario, Long>{
	
	@Query("select u from Usuario u where u.usuario = :usuario and u.password = :password order by u.id")
	public Usuario login(@Param("usuario") String usuario, @Param("password") String password);
	
	@Query("select u from Usuario u")
	public List<Usuario> listarUsuario();

}
