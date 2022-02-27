package com.mariolemos.escolar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mariolemos.escolar.Repositories.PessoaRepository;
import com.mariolemos.escolar.dominio.Pessoa;
import com.mariolemos.escolar.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	
	@Autowired
	private PessoaRepository repo;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Pessoa pess = repo.findByLogin(login);
		if (pess == null) {
			throw new UsernameNotFoundException(login);
		}
		
		return new UserSS(pess.getId(), pess.getSenha(), pess.getLogin(), pess.getPerfis());
	}
	

}
