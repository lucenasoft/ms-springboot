package br.com.lucenasoft.hrpayroll.controllers;

import br.com.lucenasoft.hrpayroll.models.PaymentModel;
import br.com.lucenasoft.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @GetMapping("/{workerId}/days/{days}")
    public ResponseEntity<PaymentModel> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        PaymentModel payment = service.getPayment(workerId, days);
        return ResponseEntity.ok(payment);
    }
}
