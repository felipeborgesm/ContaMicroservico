package com.letscode.Conta.controller;

import com.letscode.Conta.dto.ContaRequest;
import com.letscode.Conta.dto.ContaResponse;
import com.letscode.Conta.model.Conta;
import com.letscode.Conta.service.ContaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/conta")
public class ContaController {

    private final ContaService contaService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{id}")
    public ContaResponse create(@RequestBody ContaRequest contaRequest, @PathVariable Long id) {
        return contaService.create(contaRequest, id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ContaResponse findById(@PathVariable Long id) {
        return contaService.findById(id);
    }
}
