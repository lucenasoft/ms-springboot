package br.com.lucenasoft.hrworker.repositories;

import br.com.lucenasoft.hrworker.models.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
