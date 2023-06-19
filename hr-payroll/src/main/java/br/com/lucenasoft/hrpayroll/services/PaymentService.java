package br.com.lucenasoft.hrpayroll.services;

import br.com.lucenasoft.hrpayroll.controllers.WorkerModel;
import br.com.lucenasoft.hrpayroll.models.PaymentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {
    @Value("${hr-worker.host}")
    private String hrWorkerHost;

    @Autowired
    private RestTemplate restTemplate;

    public PaymentModel getPayment(Long workerId, int days) {
        Map<String, String> uriVariable = new HashMap<>();
        uriVariable.put("id", String.valueOf(workerId)); //mapa de parametros

        WorkerModel worker = restTemplate.getForObject(hrWorkerHost + "/workers/{id}", WorkerModel.class, uriVariable);
        assert worker != null;
        return new PaymentModel(worker.getName(), worker.getDailyIncome(), days);
    }
}
