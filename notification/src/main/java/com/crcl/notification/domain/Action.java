package com.crcl.notification.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Action {
    @Id
    private String id;
    private String actionName;

    public Action(String actionName) {
        this.actionName = actionName;
    }
}
