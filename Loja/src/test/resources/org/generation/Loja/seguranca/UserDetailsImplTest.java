package org.generation.Loja.seguranca;

import java.util.Collection;
import java.util.List;

import org.generation.Loja.model.Usuario;
import org.generation.Loja.model.UsuarioTest;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImplTest implements UserDetails{
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;

	public  UserDetailsImplTest(UsuarioTest user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();		
	}

	public UserDetailsImplTest() {}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {

		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
} 