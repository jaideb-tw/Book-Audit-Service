package com.thoughtworks.kafkaConsumer.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
class BookEvent(
    @Id
    var id: String? = null,
    var title: String? = null,
    var evenType: EventType? = null,
)
