package com.example.lab51;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class SentenceConsumer {
    protected Sentence sentences = new Sentence();
    @RabbitListener(queues = "bad")
    public void addBadSentence(String s){
        sentences.badSentences.add(s);

        System.out.println("In addBadSentence Method : ["+s+"]");
    }
    @RabbitListener(queues = "good")
    public void addGoodSentence(String s){
       sentences.goodSentences.add(s);
        System.out.println("In addGoodSentence Method : ["+s+"]");

    }

}
