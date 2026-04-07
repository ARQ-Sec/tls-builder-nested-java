package com.arq.tlsbuildernestedjava.service;

import com.arq.tlsbuildernestedjava.dto.PayoutResponse;
import com.arq.tlsbuildernestedjava.repository.PayoutRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PayoutService {
    private final PayoutRepository repository;

    public PayoutService(PayoutRepository repository) {
        this.repository = repository;
    }

    public List<PayoutResponse> summarize() {
        return repository.findAll().stream().map(record -> new PayoutResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
