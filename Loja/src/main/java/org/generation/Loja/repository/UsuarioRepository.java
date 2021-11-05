package org.generation.Loja.repository;

import java.util.Optional;

import org.generation.Loja.model.UsuarioTest;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepository extends JpaRepository<UsuarioTest, Long> {
	public Optional<UsuarioTest> findByUsuario(String usuario);
}