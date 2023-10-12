package ie.atu.week3;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String sendEmail(String email, String message) {
        return(email + " " + message);
    }
}
