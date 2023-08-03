package br.com.system.staff.service.impl;

import br.com.system.staff.model.Staff;
import br.com.system.staff.model.dto.StaffRequest;
import br.com.system.staff.model.dto.StaffResponse;
import br.com.system.staff.repository.StaffRepository;
import br.com.system.staff.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository repository;

    @Override
    @Transactional
    public Mono<StaffResponse> save(StaffRequest dtoRequest) {
        Staff staff = preparaSaveClient(dtoRequest);
        return repository.save(staff).map(StaffResponse::conversor);
    }

    @Override
    public Flux<StaffResponse> findAll() {
        return repository.findAll().map(StaffResponse::conversor);
    }

    private Staff preparaSaveClient(StaffRequest request){
        return Staff.builder()
                .name(request.getName())
                .surname(request.getSurname())
                .age(request.getAge())
                .build();
    }
}
