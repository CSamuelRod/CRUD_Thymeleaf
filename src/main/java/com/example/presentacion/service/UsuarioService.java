package com.example.presentacion.service;

import com.example.presentacion.model.Usuario;
import com.example.presentacion.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Método para guardar un usuario en la base de datos
    public void guardarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario); // Asegúrate de que este método esté funcionando
    }

    // Método para obtener todos los usuarios
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }
}
