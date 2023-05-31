package org.example.example02;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    public String getSong() {
        return "We will rock you!";
    }
}
