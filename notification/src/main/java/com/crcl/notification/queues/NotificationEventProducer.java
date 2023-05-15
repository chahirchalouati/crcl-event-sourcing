package com.crcl.notification.queues;

import com.crcl.notification.events.NotificationEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationEventProducer {

    private final KafkaTemplate<String, NotificationEvent> kafkaTemplate;
    private final  ObjectMapper objectMapper;
    public void sendNotificationEvent(NotificationEvent event) {
        kafkaTemplate.send("notification-events", event);
    }
}
