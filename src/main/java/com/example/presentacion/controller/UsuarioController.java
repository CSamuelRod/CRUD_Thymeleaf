package com.example.presentacion.controller;


import com.example.presentacion.model.Usuario;
import com.example.presentacion.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@CrossOrigin
@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Maneja las peticiones GET a "/formulario"
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        // Añade un nuevo objeto Usuario al modelo
        model.addAttribute("usuario", new Usuario());
        // Devuelve la vista "formulario"
        return "formulario";
    }

    // Maneja las peticiones POST a "/registrar"
    @PostMapping("/registrar")
    public String registrarUsuario(@ModelAttribute Usuario usuario) {
        // Llama al servicio para guardar el usuario
        usuarioService.guardarUsuario(usuario);
        // Redirige a la lista de usuarios después de registrar
        return "redirect:/usuarios";
    }

    // Maneja las peticiones GET a "/usuarios"
    @GetMapping("/usuarios")
    public String mostrarUsuarios(Model model) {
        // Obtiene la lista de usuarios desde el servicio
        List<Usuario> usuarios = usuarioService.obtenerTodosLosUsuarios();
        // Añade la lista de usuarios al modelo
        model.addAttribute("usuarios", usuarios);
        // Devuelve la vista "usuarios"
        return "usuarios";
    }
}