package com.dmitrii.socialnetwork.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuthenticationEventListener {

  @EventListener
  public void onSuccess(AuthenticationSuccessEvent event) {
    log.debug("Successful authentication for user: {}",
        event.getAuthentication().getName());
  }

  @EventListener
  public void onFailure(AbstractAuthenticationFailureEvent event) {
    log.debug("Failed authentication attempt: {}",
        event.getException().getMessage());
  }
}
