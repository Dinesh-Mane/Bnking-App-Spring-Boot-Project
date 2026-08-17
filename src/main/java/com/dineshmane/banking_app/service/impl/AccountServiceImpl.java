package com.dineshmane.banking_app.service.impl;

import com.dineshmane.banking_app.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl {
    private AccountRepository accountRepository;

}
