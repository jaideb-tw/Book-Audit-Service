package com.thoughtworks.kafkaConsumer.service

import com.thoughtworks.kafkaConsumer.model.BookEvent
import com.thoughtworks.kafkaConsumer.repository.BookEventRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookAuditService(
    @Autowired
    private val bookEventRepository: BookEventRepository
) {
    fun save(event: BookEvent) {
       bookEventRepository.save(event)
    }
}