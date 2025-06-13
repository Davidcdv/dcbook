package com.crni99.bookstore.controller;

import com.crni99.bookstore.service.EmailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailTestController {

    private final EmailService emailService;

    public EmailTestController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/test-email")
    public String sendTestEmail(@RequestParam String to) {
        emailService.sendEmail(to, "Test Email", "This is a test email from your bookstore.");
        return "Email sent successfully to " + to;
    }
}

