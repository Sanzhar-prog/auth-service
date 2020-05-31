package kg.megacom.authservice.controllers;

import kg.megacom.authservice.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class LoginController {

       @Autowired
       private LoginService loginService;

       @PostMapping("/login")
       public ResponseEntity login(@RequestParam String login, @RequestParam String password ){
            return ResponseEntity.ok(loginService.login(login, password));
       }
}
