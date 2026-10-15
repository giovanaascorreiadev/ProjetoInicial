package com.giovana.demo.service;

import org.springframework.stereotype.Service;

import com.giovana.demo.entities.Usuario;

@Service
public class LoginService {

	public boolean validarLogin(Usuario usuario) {
		return "admin".equals(usuario.getUsername()) && "1234".equals(usuario.getPassword());
	}
}
