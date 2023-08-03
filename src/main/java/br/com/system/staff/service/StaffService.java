package br.com.system.staff.service;

import br.com.system.staff.model.dto.StaffRequest;
import br.com.system.staff.model.dto.StaffResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StaffService {

    Mono<StaffResponse> save(StaffRequest request);

    Flux<StaffResponse> findAll();
}
