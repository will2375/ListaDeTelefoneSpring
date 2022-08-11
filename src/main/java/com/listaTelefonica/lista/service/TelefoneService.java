package com.listaTelefonica.lista.service;

import com.listaTelefonica.lista.model.TelefoneModel;
import com.listaTelefonica.lista.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelefoneService {

    @Autowired
    private TelefoneRepository telefoneRepository;

    public List<TelefoneModel> buscarTodos() {
        return telefoneRepository.findAll();
    }

    public Optional<TelefoneModel> buscarId(Long codigo) {
        return telefoneRepository.findById(codigo);
    }

    public TelefoneModel cadastrar(TelefoneModel telefoneModel) {
       telefoneModel.getCodigo();
        telefoneModel.getNome();
        telefoneModel.getDdd();
        telefoneModel.getNumero();
        return telefoneRepository.save(telefoneModel);
    }

    public TelefoneModel alterar(TelefoneModel telefoneModel) {
        telefoneModel.getCodigo();
        telefoneModel.getNome();
        telefoneModel.getDdd();
        telefoneModel.getNumero();
        return telefoneRepository.save(telefoneModel);
    }

    public void deletar(Long codigo) {telefoneRepository.deleteById(codigo);}
}
