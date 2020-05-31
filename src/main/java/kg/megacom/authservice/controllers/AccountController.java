package kg.megacom.authservice.controllers;

import kg.megacom.authservice.models.Account;
import kg.megacom.authservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    public ResponseEntity saveAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountService.createAccount(account));
    }



}
