package br.com.system.staff.repository;

import br.com.system.staff.model.Staff;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StaffRepository extends ReactiveMongoRepository<Staff, String> {
}
