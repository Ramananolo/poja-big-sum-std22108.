package com.poja.big-sum-std22108.mail;

import com.poja.big-sum-std22108.PojaGenerated;
import jakarta.mail.internet.InternetAddress;

import java.io.File;
import java.util.List;

@PojaGenerated
public record Email(
    InternetAddress to,
    List<InternetAddress> cc,
    List<InternetAddress> bcc,
    String subject,
    String htmlBody,
    List<File> attachments) {}
