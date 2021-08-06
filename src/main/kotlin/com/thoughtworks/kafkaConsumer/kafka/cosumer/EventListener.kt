package com.thoughtworks.kafkaConsumer.kafka.cosumer

import com.fasterxml.jackson.databind.ObjectMapper
import com.thoughtworks.kafkaConsumer.model.BookEvent
import com.thoughtworks.kafkaConsumer.service.BookAuditService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class EventListener(
    @Autowired
    private val bookAuditService: BookAuditService,
) {

    @KafkaListener(topics = ["book-inventory"], groupId = "audit_book")
    fun consume(message: String) {
        val bookEvent = ObjectMapper().readValue(message, BookEvent::class.java)
        bookAuditService.save(bookEvent)
    }
}