package com.example.lab51;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Sentence {
    public ArrayList<String> badSentences;
    public ArrayList<String> goodSentences;
    public Sentence(){
        badSentences = new ArrayList<>();
        goodSentences = new ArrayList<>();
    }
}
