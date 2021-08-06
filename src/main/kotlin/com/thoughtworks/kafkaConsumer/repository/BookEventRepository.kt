package com.thoughtworks.kafkaConsumer.repository

import com.thoughtworks.kafkaConsumer.model.BookEvent
import org.springframework.data.mongodb.repository.MongoRepository

interface BookEventRepository : MongoRepository<BookEvent, String> {
}