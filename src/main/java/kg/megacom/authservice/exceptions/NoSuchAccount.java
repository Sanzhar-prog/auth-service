package kg.megacom.authservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NoSuchAccount extends RuntimeException {
    public NoSuchAccount(String message) {
        super(message);
    }
}
