package com.example.meusgastos.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meusgastos.domain.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
   
    List<Usuario> findByEmail(String Email);
    
}
