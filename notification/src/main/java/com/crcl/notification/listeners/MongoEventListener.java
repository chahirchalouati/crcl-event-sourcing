package com.crcl.notification.listeners;

import com.crcl.notification.domain.Action;
import com.crcl.notification.events.NotificationEvent;
import com.crcl.notification.queues.NotificationEventProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.AfterSaveEvent;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MongoEventListener extends AbstractMongoEventListener<Action> {

    private final NotificationEventProducer notificationEventProducer;

    @Override
    public void onAfterSave(AfterSaveEvent<Action> event) {
        NotificationEvent notificationEvent = new NotificationEvent();
        notificationEvent.setNotificationId(event.getDocument().toJson());
        notificationEventProducer.sendNotificationEvent(notificationEvent);
    }
}
