package com.example.SpringDataPostgre.rabbit.listener;

import com.example.SpringDataPostgre.rabbit.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "myQueue")
    public void handleMessage(Notification xNotification)
    {
        System.out.println("Mesaj Alındı");
        System.out.println(xNotification.toString());
    }
}
