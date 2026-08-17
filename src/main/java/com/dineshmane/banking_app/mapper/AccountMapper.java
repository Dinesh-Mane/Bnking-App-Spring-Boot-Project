package com.dineshmane.banking_app.mapper;

import com.dineshmane.banking_app.dto.AccountDTO;
import com.dineshmane.banking_app.entity.Account;

public class AccountMapper {

    // convert AccountDTO to Account
    public static Account mapToAccount(AccountDTO accountDTO){
        Account account = new Account(
                accountDTO.getId(),
                accountDTO.getAccountHolderName(),
                accountDTO.getBalance()
        );
        return account;
    }

    // convert Account to AccountDTO
    public static AccountDTO mapToAccountDTO(Account account){
        AccountDTO accountDTO = new AccountDTO(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDTO;
    }
}
