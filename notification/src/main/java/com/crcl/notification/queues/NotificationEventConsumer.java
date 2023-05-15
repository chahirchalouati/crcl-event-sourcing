package com.crcl.notification.queues;

import com.crcl.notification.events.NotificationEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationEventConsumer {

//    @KafkaListener(topics = "notification-events", groupId = "notification-consumer-group")
//    public void receiveNotificationEvent(NotificationEvent event) {
//        System.out.println(event);
//    }
}
