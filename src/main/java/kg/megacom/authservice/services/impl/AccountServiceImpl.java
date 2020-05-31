package kg.megacom.authservice.services.impl;

import kg.megacom.authservice.dao.AccountRepository;
import kg.megacom.authservice.models.Account;
import kg.megacom.authservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
}
