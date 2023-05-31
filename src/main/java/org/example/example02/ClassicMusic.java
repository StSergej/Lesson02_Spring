package org.example.example02;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music{
    public String getSong() {
        return "To Elise";
    }
}
