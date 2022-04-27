package com.example.SpringDataPostgre.rabbit.producer;

import com.example.SpringDataPostgre.rabbit.Notification;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.UUID;

@Service
public class NotificationProducer {

    @Value("${sr.rabbit.routing.name}")
    private String routingName;
    @Value("${sr.rabbit.exchange.name}")
    private String exchangeName;

    @PostConstruct
    public void init()
    {
        Notification notification = new Notification();
        notification.setNotificationId(UUID.randomUUID().toString());
        notification.setCreatedDate(new Date());
        notification.setMessage("grkem aykac rabbitmq");
        notification.setSeen(false);
        sendToQueue(notification);
    }
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendToQueue(Notification xNotification)
    {

        rabbitTemplate.convertAndSend(exchangeName,routingName, xNotification);
    }

}
