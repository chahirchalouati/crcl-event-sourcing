package com.crcl.notification.repository;

import com.crcl.notification.domain.Action;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ActionRepository extends ReactiveMongoRepository<Action, String> {
}
