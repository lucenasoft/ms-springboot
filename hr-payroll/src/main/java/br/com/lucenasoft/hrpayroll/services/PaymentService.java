package br.com.lucenasoft.hrpayroll.services;

import br.com.lucenasoft.hrpayroll.controllers.WorkerModel;
import br.com.lucenasoft.hrpayroll.feignclients.WorkerFeignClient;
import br.com.lucenasoft.hrpayroll.models.PaymentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {
    @Autowired
    private WorkerFeignClient feignClient;

    public PaymentModel getPayment(Long workerId, int days) {
        WorkerModel worker = feignClient.findById(workerId).getBody();
        assert worker != null;
        return new PaymentModel(worker.getName(), worker.getDailyIncome(), days);
    }
}
