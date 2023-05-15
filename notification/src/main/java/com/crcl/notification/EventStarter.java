package com.crcl.notification;

import com.crcl.notification.domain.Action;
import com.crcl.notification.repository.ActionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.UUID;

@Configuration
@EnableScheduling
@RequiredArgsConstructor
public class EventStarter {

    private final ActionRepository actionRepository;

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

    @Scheduled(fixedDelay = 1000L)
    public void fireAction() {
        actionRepository.save(new Action(UUID.randomUUID().toString()))
                .subscribe();
    }
}
