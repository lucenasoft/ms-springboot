package br.com.lucenasoft.hrpayroll.services;

import br.com.lucenasoft.hrpayroll.models.PaymentModel;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentModel getPayment(Long workerId, int days) {
        return new PaymentModel("Bob",200.0, days);
    }
}
