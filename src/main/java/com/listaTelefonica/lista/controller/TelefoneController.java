package com.listaTelefonica.lista.controller;


import com.listaTelefonica.lista.model.TelefoneModel;
import com.listaTelefonica.lista.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TelefoneController {

    @Autowired
    private TelefoneService telefoneService;

    @GetMapping(path = "/telefones")
    public List<TelefoneModel> buscarTodosTelefones() {
        return telefoneService.buscarTodos();
    }

    @GetMapping(path = "/telefones/{codigo}")
    public Optional<TelefoneModel> buscarPorId(@PathVariable  Long codigo) {
        return telefoneService.buscarId(codigo);
    }

    @PostMapping(path = "/telefones")
    @ResponseStatus(HttpStatus.CREATED)
    public TelefoneModel cadastrarTelefones(@RequestBody TelefoneModel telefoneModel) {
        return telefoneService.cadastrar(telefoneModel);
    }

    @PutMapping(path = "/telefones/{codigo}")
    public TelefoneModel alterarTelefones(@RequestBody TelefoneModel telefoneModel) {
        return telefoneService.alterar(telefoneModel);
    }

    @DeleteMapping(path = "telefones/{codigo}")
    public void deletarTelefones(@PathVariable Long codigo) {
        telefoneService.deletar(codigo);
    }
}
