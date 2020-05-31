package kg.megacom.authservice.services.impl;

import kg.megacom.authservice.dao.UserSessionRepository;
import kg.megacom.authservice.models.Account;
import kg.megacom.authservice.models.UserSession;
import kg.megacom.authservice.services.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.UUID;

@Service
public class UserSessionServiceImpl implements UserSessionService {

    @Autowired
    private UserSessionRepository userSessionRepository;

    @Override
    public String getToken() {
        return UUID.randomUUID().toString();
    }

    @Override
    public void saveUserSession(Account account, String token) {
        UserSession userSession = new UserSession();
        userSession.setAccount(account);
        userSession.setToken(token);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 5);
        userSession.setExpiredDate(calendar.getTime());

        userSessionRepository.save(userSession);
    }
}
