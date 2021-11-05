package org.generation.Loja.repository;

import java.util.Optional;

import org.generation.Loja.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepositoryTest extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}