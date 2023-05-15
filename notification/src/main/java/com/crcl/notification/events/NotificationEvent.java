package com.crcl.notification.events;

import lombok.Data;

@Data
public class NotificationEvent {
    private String notificationId;
    private String userId;
    private String message;
}

