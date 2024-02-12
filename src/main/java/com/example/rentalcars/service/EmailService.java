package com.example.rentalcars.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.context.MessageSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.Locale;

@Service
public class EmailService {

    private final TemplateEngine templateEngine;
    private final MessageSource messageSource;
    private final JavaMailSender javaMailSender;

    public EmailService(TemplateEngine templateEngine,
                        MessageSource messageSource,
                        JavaMailSender javaMailSender ) {
        this.templateEngine = templateEngine;
        this.messageSource = messageSource;
        this.javaMailSender = javaMailSender;
    }

    public void sendRegistrationEmail(String userEmail,
                                      String username,
                                      Locale preferredLocale){
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();


        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
            mimeMessageHelper.setFrom("carbook@carbook.com");
            mimeMessageHelper.setTo(userEmail);
            mimeMessageHelper.setSubject(getEmailSubject(preferredLocale));
            mimeMessageHelper.setText(generateMessageContent(preferredLocale, username),true);

            javaMailSender.send(mimeMessageHelper.getMimeMessage());
        } catch (MessagingException e) {
            throw new RuntimeException(e);

        }

    }

    private String getEmailSubject(Locale locale){
        return messageSource.getMessage("registration_subject", new Object[0], locale);
    }

    private String generateMessageContent(Locale locale, String username) {
        Context ctx = new Context();
        ctx.setLocale(locale);
        ctx.setVariable("username", username);
        return templateEngine.process("email/registration",ctx);

    }
}
