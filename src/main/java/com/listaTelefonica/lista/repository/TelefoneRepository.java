package com.listaTelefonica.lista.repository;

import com.listaTelefonica.lista.model.TelefoneModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<TelefoneModel, Long> {
}
