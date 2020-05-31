package kg.megacom.authservice.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user_sessions")
public class UserSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String token;
    private Date expiredDate;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
