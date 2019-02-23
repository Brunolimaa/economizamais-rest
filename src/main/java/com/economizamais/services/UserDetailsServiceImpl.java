package com.economizamais.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.economizamais.domain.Loja;
import com.economizamais.repositories.LojaRepository;
import com.economizamais.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private LojaRepository repo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Loja loja = repo.findByEmail(email);
		if(loja == null) {
			throw new UsernameNotFoundException(email);
		}
		return new UserSS(loja.getId(), loja.getEmail(), loja.getSenha(), loja.getPerfis());
	}

}
