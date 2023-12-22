package com.poja.big-sum-std22108.mail;

import com.poja.big-sum-std22108.PojaGenerated;
import jakarta.mail.internet.InternetAddress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.ses.model.VerifyEmailIdentityRequest;

import java.util.function.Consumer;

@Component
@AllArgsConstructor
@PojaGenerated
public class EmailAddressVerifier implements Consumer<InternetAddress> {

  private final EmailConf emailConf;

  @Override
  public void accept(InternetAddress emailAddress) {
    emailConf
        .getSesClient()
        .verifyEmailIdentity(
            VerifyEmailIdentityRequest.builder().emailAddress(emailAddress.getAddress()).build());
  }
}
