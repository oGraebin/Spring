package org.generation.Loja.seguranca;

import java.util.Optional;

import org.generation.Loja.model.Usuario;
import org.generation.Loja.model.UsuarioTest;
import org.generation.Loja.repository.UsuarioRepository;
import org.generation.Loja.repository.UsuarioRepositoryTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplTest implements UserDetailsService {

	@Autowired
	private UsuarioRepositoryTest userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Optional<UsuarioTest> user = Optional.empty();
		user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));
	
		return user.map(UserDetailsImplTest::new).get();
	
}}