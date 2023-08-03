package br.com.system.staff.controller;

import br.com.system.staff.model.dto.StaffRequest;
import br.com.system.staff.model.dto.StaffResponse;
import br.com.system.staff.service.StaffService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/staff-v1")
public class StaffController {

    private final StaffService service;

    @GetMapping("/buscaStaff")
    public ResponseEntity<Flux<StaffResponse>> buscaTodosStaff(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping("/salvarStaff")
    public ResponseEntity<Mono<StaffResponse>> salvarStaff(@RequestBody StaffRequest request){
        return ResponseEntity.ok(service.save(request));
    }
}

