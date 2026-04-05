package com.arq.tlsbuildernestedjava.service;

import com.arq.tlsbuildernestedjava.repository.InvoiceRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class InvoiceServiceTest {
    @Test
    void returnsSeedData() {
        InvoiceService service = new InvoiceService(new InvoiceRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
