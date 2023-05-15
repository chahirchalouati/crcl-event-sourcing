package com.crcl.notification.serializers;

import com.crcl.notification.events.NotificationEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.common.errors.SerializationException;
import java.util.Map;

public class NotificationEventSerializer implements Serializer<NotificationEvent> {

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // No additional configuration required for this serializer
    }

    @Override
    public byte[] serialize(String topic, NotificationEvent notificationEvent) {
        try {
            if (notificationEvent == null)
                return null;

            // Convert the NotificationEvent object to a byte array
            // Implement your custom serialization logic here
            // For example, you can use JSON or any other serialization format

            // Sample implementation using JSON serialization with Jackson
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsBytes(notificationEvent);
        } catch (Exception e) {
            throw new SerializationException("Error serializing NotificationEvent", e);
        }
    }

    @Override
    public void close() {
        // No resources to release
    }
}
