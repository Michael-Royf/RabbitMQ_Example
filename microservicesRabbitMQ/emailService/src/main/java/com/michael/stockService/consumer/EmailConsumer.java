package com.michael.stockService.consumer;


import com.michael.clients.dtoOrders.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailConsumer {
    @RabbitListener(queues = "${rabbitmq.queue.email.name}")
    public void consumer(OrderEvent orderEvent) {
        log.info(String.format("Order event received im email service -> %s", orderEvent.toString()));
        //email service needs to email customer
    }
}
