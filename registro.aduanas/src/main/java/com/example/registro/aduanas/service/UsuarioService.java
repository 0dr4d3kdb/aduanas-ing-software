package com.example.registro.aduanas.service;

import com.example.registro.aduanas.model.Usuario;
import com.example.registro.aduanas.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario){
        if (!usuario.getContrasena().equals(usuario.getConfirmacionContrasena())) {
            throw new IllegalArgumentException("Las contraseñas no coinciden");
        }
        return usuarioRepository.save(usuario);
    }
}
