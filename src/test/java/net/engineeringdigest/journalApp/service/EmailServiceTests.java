package net.engineeringdigest.journalApp.service;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {
    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail() {
        emailService.sendEmail("jiwaxi3903@framitag.com", "Testing Java Mail Sender", "Hi, Aap kaise hain ?");
    }
}
