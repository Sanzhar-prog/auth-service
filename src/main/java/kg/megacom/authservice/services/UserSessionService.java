package kg.megacom.authservice.services;

import kg.megacom.authservice.models.Account;

public interface UserSessionService {

    String getToken();

    void saveUserSession(Account account, String token);
}
