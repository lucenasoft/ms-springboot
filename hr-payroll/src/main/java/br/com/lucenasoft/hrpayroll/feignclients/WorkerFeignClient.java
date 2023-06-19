package br.com.lucenasoft.hrpayroll.feignclients;

import br.com.lucenasoft.hrpayroll.controllers.WorkerModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {
    @GetMapping("/{id}")
    ResponseEntity<WorkerModel> findById(@PathVariable Long id);
}
