package kg.megacom.authservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class IncorrectPassword extends RuntimeException {

    public IncorrectPassword(String message) {
        super(message);
    }
}
