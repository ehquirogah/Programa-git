package com.runningcoach.runningcoach_api.repository;

import com.runningcoach.runningcoach_api.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}